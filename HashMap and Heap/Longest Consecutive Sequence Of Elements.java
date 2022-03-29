import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = scn.nextInt();
    }


    HashMap<Integer,Boolean> ans = new HashMap<>();
    for(int var:arr){
        ans.put(var,true);
    }

    for(int var:arr){
        if(ans.containsKey(var - 1) == true ){
            ans.put(var,false);
        }
    }
    int mlen=0,msp=0;

    for(int val:arr){
        if(ans.get(val) == true){
            int tsp = val;
            int tlen = 1;
            while ( ans.containsKey(tsp+tlen) == true ) {
                tlen++;
            }

            if(tlen>mlen){
                mlen=tlen;
                msp = tsp;
            }
        }
    }
    for(int i=0;i<mlen;i++){
        System.err.println(msp+i);
    }
 }

}
