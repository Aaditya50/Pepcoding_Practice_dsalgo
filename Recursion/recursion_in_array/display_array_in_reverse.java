import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        displayArrReverse(arr,0);
        
    }

    public static void displayArrReverse(int[] arr, int idx) {
    
        //exp:- idx=arr.length-1 , idx =arr.length-2 ....   
        //faith:- idx=arr.length-2,arr.length-3......
        //ewf:- idx= arr.length-1
        if(idx==arr.length){
            return;
        }
        
        displayArrReverse(arr,idx+1);
        System.out.println(arr[idx]);
        
        
    }

}
