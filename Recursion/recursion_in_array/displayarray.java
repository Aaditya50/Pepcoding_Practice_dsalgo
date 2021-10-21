import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        displayArr(arr,0);
    }

    public static void displayArr(int[] arr, int idx){
        //exp = da(arr,0) like print elements from idx to end
        //faith = da(arr,idx+1) print elements from idx+1 to end
        //EWF = idx     (idx+1)
        if(idx==arr.length){
            return;
        }
        System.out.println(arr[idx]);
        displayArr(arr,idx+1);
    }

}
