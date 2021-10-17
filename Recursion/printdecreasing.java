import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printDecreasing(n);
    }

    public static void printDecreasing(int n){
        if(n==0){
            return;
        }
        //Expectations PD(n) = n n-1 n-2 ... 3 2 1
        //Faith PD(n-1) = n-1 n-2 .... 3 2 1
        //EWF PD(n) = n PD(n-1)
        System.out.println(n);
        printDecreasing(n-1);
        
    }

}
