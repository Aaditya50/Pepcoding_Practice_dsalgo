import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        HashMap<Character,Integer> ans = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ans.containsKey(ch) == false){
                ans.put(ch,1);
            }else{
                int oldfreq = ans.get(ch);
                int newfreq = oldfreq+1;
                ans.put(ch,newfreq);
            }
        }


        char max = str.charAt(0);
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ans.get(ch)>ans.get(max)){
                max = ch;
            }
        }
        System.out.println(max);
    }

}
