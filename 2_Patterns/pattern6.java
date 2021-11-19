import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int sp = 1;
        int st = n/2+1;
        for(int i=0;i<n;i++){
            for(int j=0;j<st;j++){
                System.out.print("*\t");
            }
            for(int j=0;j<sp;j++){
                System.out.print("\t");
            }
            for(int j=0;j<st;j++){
                System.out.print("*\t");
            }
            if(i<n/2){
                sp+=2;
                st--;
            }else{
                sp-=2;
                st++;
            }
            System.out.println();
        }

    }
}
