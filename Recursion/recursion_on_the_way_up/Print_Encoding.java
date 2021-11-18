import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    printEncodings(str,"");
    }

    public static void printEncodings(String str , String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }else if(str.length()==1){
            char ch = str.charAt(0);
            if(ch=='0'){
                return;
            }else{
                int chv = ch-'0';
                char code = (char)('a'+chv-1);
                asf = asf+code;
                System.out.println(asf);
            }
        }else{
            char ch = str.charAt(0);
            String roq = str.substring(1);
            
            if(ch=='0'){
                return;
            }else{
                int chv = ch-'0';
                char code = (char)('a'+chv-1);
                printEncodings(roq,asf+code);
                
            }
            
            String ch12 = str.substring(0,2);
            String roq12 = str.substring(2);
            
            int chv12 = Integer.parseInt(ch12);
            if(chv12 <= 26){
                char code = (char)('a'+chv12-1);
                printEncodings(roq12,asf+code);
            }
            
            
        }
    }

}
