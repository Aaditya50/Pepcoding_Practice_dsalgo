import java.util.*;
 import java.lang.*;
 import java.io.*;
 class Main
  {
 	 public static void main (String[] args) throws IOException
 	  {
 	 	 Scanner scn= new Scanner(System.in);
 	    	 int n = scn.nextInt();
 	 	 int[] num = new int[n];
 	 	 for (int i = 0; i < n; i++) {
 	 	 	 	 num[i] = scn.nextInt();
 	 	 	 }
 	 	 int k = scn.nextInt();
 	 	 solve(n,num,k);
 	  }
 	 // -----------------------------------------------------
 	 // This is a functional problem. Only this function has to be written.
 	 // This function takes as input an array,n length of array and k.
 	 // It should print required output.
 	  public static void solve(int n,int[] arr,int k){
 	     //Write your code here
		  PriorityQueue<Integer> ans = new PriorityQueue<>();
		  for(int i=0;i<k;i++){
			  ans.add(arr[i]);
		  }

		  for(int i=k;i<arr.length;i++){
			  int val = arr[i];
			  if(val>ans.peek()){
				  ans.remove();
				  ans.add(val);
			  }
		  }
		  int[] res = new int[k];
		  int j=0;
		  while(ans.size()>0){
			  res[j] = ans.peek();
			  j++;
			  ans.remove();
		  }

		  for(int i=res.length-1;i>=0;i--){
			  System.out.print(res[i]+" ");
		  }

     }
 }
