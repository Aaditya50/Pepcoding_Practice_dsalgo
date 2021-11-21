import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n = scn.nextInt();
     int sp = 2*n-3;
     int st = 1;
     int a = 1;
     for(int i=1;i<=n;i++){
         for(int j=1;j<=st;j++){
             System.out.print(a+"\t");
             a++;
         }
         for(int j=1;j<=sp;j++){
             System.out.print("\t");
         }
         if(i==n){
             st--;
             a--;
         }
         for(int j=1;j<=st;j++){
             a--;
             System.out.print(a+"\t");
             
         }
         
         st++;
         sp-=2;
         System.out.println();
     }

 }
}
