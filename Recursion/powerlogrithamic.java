import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int x = scn.nextInt();
    int n = scn.nextInt();
    int a = power(x, n);
    System.out.println(a);
  }

  public static int power(int x, int n) {
    if(n==0){
        return 1;
    }
    
    //exp = power(x , n)
    //faith = power(x , n-1)
    //ewf = power(x,n)*x
    
    
    int x1 = power(x,n-1);
    int xn = x1*x;
    return xn;
  }

}
