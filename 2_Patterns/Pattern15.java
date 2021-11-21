import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int sp = n/2;
        int st = 1;
        int a=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<sp;j++){
                System.out.print("\t");
            }
            int c = a;
            for(int j=0;j<st;j++){
                System.out.print(c+"\t");
                if(j < st/2){
                    c++;
                }else{
                    c--;
                }
            }
            

            if(i<n/2){
                sp--;
                st+=2;
                a++;
            }else{
                sp++;
                st-=2;
                a--;
            }
            System.out.println();
        }

    }
}
