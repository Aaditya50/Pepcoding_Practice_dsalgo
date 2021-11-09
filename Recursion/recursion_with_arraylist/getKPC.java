import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    ArrayList<String> words = getKPC(str);
    System.out.println(words);
    }

    static String[] codes = {".;", "abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    
    public static ArrayList<String> getKPC(String str) {
        if(str.length()==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        
        ArrayList<String> rres = getKPC(ros);
        ArrayList<String> mres = new ArrayList<>();
        
        String codeforch = codes[ch -'0'];
        for(int i=0;i<codeforch.length();i++){
            char chcode = codeforch.charAt(i);
            for(String s : rres){
                mres.add(chcode+s);
            }
        }
        return mres;
    }

}
