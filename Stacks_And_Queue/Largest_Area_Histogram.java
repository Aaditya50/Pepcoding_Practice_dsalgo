


import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
       arr[i] = Integer.parseInt(br.readLine());
    }

    // code
    
    int[] rb = new int[n];
    Stack<Integer> st = new Stack<>();
    st.push(n-1);
    rb[n-1] = n;
    
    for(int i=n-2;i>=0;i--){
        while(st.size()>0 && arr[i]<=arr[st.peek()]){
            st.pop();
        }if(st.size()==0){
            rb[i] = n;
        }else{
            rb[i] = st.peek();
        }
        st.push(i);
    }
    
    int[] lb = new int[n];
    st = new Stack<>();
    st.push(0);
    lb[0] = -1;
    
    for(int i=0;i<n;i++){
        while(st.size()>0 && arr[i]<=arr[st.peek()]){
            st.pop();
        }if(st.size()==0){
            lb[i] = -1;
        }else{
            lb[i] = st.peek();
        }
        st.push(i);
    }
    
    int maxArea = 0;
    for(int i=0;i<n;i++){
        int width = rb[i]-lb[i]-1;
        int area = arr[i]*width;
        if(area>maxArea){
            maxArea=area;
        }
    }
    System.out.println(maxArea);

 }
}
