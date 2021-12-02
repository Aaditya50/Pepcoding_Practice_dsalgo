import java.io.*;
import java.util.*;

public class Main {

  public static void targetSumPair(int[] arr, int target){
    //write your code here
    Arrays.sort(arr);
    int l = 0;
    int r = arr.length-1;
    while(l<r){
        if(arr[l]+arr[r]<target){
            l++;
        }else if(arr[l]+arr[r]>target){
            r--;
        }else if(arr[l]+arr[r]==target){
            System.out.println(arr[l]+", "+arr[r]);
            l++;
            r--;
        }
    }
  }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ;i < n; i++){
      arr[i] = scn.nextInt();
    }
    int target = scn.nextInt();
    targetSumPair(arr,target);
  }

}



/*

Sample Input

12
9 
-48 
100 
43 
84 
74 
86 
34 
-37 
60 
-29 
44
160

Sample Output

60, 100
74, 86

*/
