import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pzz(n);
        
    }

    public static void pzz(int n){
        if(n==0){
            return;
        }
        //exp = pzz(n) = n n-1 n-1 n-1 n n-1 n-1 n-1 n
        //faith = pzz(n-1) = n-1 n-1 n-1
        //ewf = pzz(n) = n pzz(n-1) n pzz(n-1) n
        System.out.print(n+" ");
        pzz(n-1);
        System.out.print(n+" ");
        pzz(n-1);
        System.out.print(n+" ");
    }

}
