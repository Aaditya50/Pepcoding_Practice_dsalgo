import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int sp = n-1;
        int st = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<sp;j++){
                System.out.print("\t");
                
            }
            System.out.print("*\t");
            System.out.println();
            sp--;
            
        }

    }
}
