import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int f = factorial(n);
        System.out.print(f);
    }

    public static int factorial(int n){
        //exp = f(n) = n*n-1*n-2*...*1
        //faith = f(n-1) = n-1*n-2*...*1
        //ewf = f(n) = n*f(n-1);
        
        if(n==1){
            return 1;
        }
        int f1 = factorial(n-1);
        int fin = f1*n;
        return fin;
        
    }

}
