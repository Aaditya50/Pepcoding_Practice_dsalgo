import java.io.*;
import java.util.*;

public class Main {
  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  public static class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
      this.node = node;
      this.state = state;
    }
  }

  public static Node construct(Integer[] arr) {
    Node root = new Node(arr[0], null, null);
    Pair rtp = new Pair(root, 1);

    Stack<Pair> st = new Stack<>();
    st.push(rtp);

    int idx = 0;
    while (st.size() > 0) {
      Pair top = st.peek();
      if (top.state == 1) {
        idx++;
        if (arr[idx] != null) {
          top.node.left = new Node(arr[idx], null, null);
          Pair lp = new Pair(top.node.left, 1);
          st.push(lp);
        } else {
          top.node.left = null;
        }

        top.state++;
      } else if (top.state == 2) {
        idx++;
        if (arr[idx] != null) {
          top.node.right = new Node(arr[idx], null, null);
          Pair rp = new Pair(top.node.right, 1);
          st.push(rp);
        } else {
          top.node.right = null;
        }

        top.state++;
      } else {
        st.pop();
      }
    }

    return root;
  }

  public static void display(Node node) {
    if (node == null) {
      return;
    }

    String str = "";
    str += node.left == null ? "." : node.left.data + "";
    str += " <- " + node.data + " -> ";
    str += node.right == null ? "." : node.right.data + "";
    System.out.println(str);

    display(node.left);
    display(node.right);
  }

  public static int height(Node node){
    if(node == null) return -1;
    int le = height(node.left);
    int ri = height(node.right);
    return Math.max(le,ri)+1;
  }


  public static class isBal{
    boolean isBalance;
    int min,max,size ;
    Node root;
  }
  public static isBal isBalance(Node node){
    if(node == null){
      isBal ans = new isBal();
      ans.min = Integer.MAX_VALUE;
      ans.max = Integer.MIN_VALUE;
      ans.isBalance = true;
      ans.root = null;
      ans.size = 0;
      return ans;
    }
    isBal le = isBalance(node.left);
    isBal ri = isBalance(node.right);

    isBal res = new isBal();

    res.min = Math.min(node.data,Math.min(le.min,ri.min));
    res.max = Math.max(node.data,Math.max(le.max,ri.max));

    res.isBalance = le.isBalance && ri.isBalance && (node.data >= le.max && node.data <= ri.min);


    if(res.isBalance){
      res.root = node;
      res.size = le.size+ri.size+1;
    }else if(le.size > ri.size){
      res.root = le.root;
      res.size = le.size;
    }else{
      res.root = ri.root;
      res.size = ri.size;
    }

    return res;


   
  }
  
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Integer[] arr = new Integer[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      if (values[i].equals("n") == false) {
        arr[i] = Integer.parseInt(values[i]);
      } else {
        arr[i] = null;
      }
    }

    Node root = construct(arr);
    
    // write your code here
    isBal ans =  isBalance(root);

    System.out.println(ans.root.data+"@"+ans.size);
  }

}
