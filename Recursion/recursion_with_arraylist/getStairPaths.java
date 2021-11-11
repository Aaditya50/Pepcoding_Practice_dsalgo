import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    ArrayList<String> path = getStairPaths(n);
    System.out.println(path);
    }

    public static ArrayList<String> getStairPaths(int n) {
        
        if(n==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }else if(n<0){
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }
        
        ArrayList<String> paths1 = getStairPaths(n-1);
        ArrayList<String> paths2 = getStairPaths(n-2);
        ArrayList<String> paths3 = getStairPaths(n-3);
        ArrayList<String> p = new ArrayList<>();
        
        for(String path:paths1){
            p.add(1+path);
        }
        for(String path:paths2){
            p.add(2+path);
        }
        for(String path:paths3){
            p.add(3+path);
        }
        return p;
    }

}
