import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int[] arr1 = new int[n1];
    for(int i=0;i<n1;i++){
        arr1[i] = scn.nextInt();
    }
    int n2 = scn.nextInt();
    int[] arr2 = new int[n2];
    for(int i=0;i<n2;i++){
        arr2[i] = scn.nextInt();
    }

    HashMap<Integer,Integer> ans = new HashMap<>();
    for(int val:arr1){
        if(ans.containsKey(val) == false){
            ans.put(val,1);
        }else{
            int old = ans.get(val);
            int newf = old+1;
            ans.put(val,newf);
        }
    }

    for(int val:arr2){
        if(ans.containsKey(val) == true && ans.get(val)>0){
            System.out.println(val);
            int old = ans.get(val);
            int newf = old-1;
            ans.put(val,newf);
        }
    }

 }

}
