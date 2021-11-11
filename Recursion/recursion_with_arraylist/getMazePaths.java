import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    
    ArrayList<String> paths = getMazePaths(1,1,n,m);
    System.out.println(paths);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        
        ArrayList<String> hp = new ArrayList<>();
        ArrayList<String> vp = new ArrayList<>();
        
        if(sc<dc){
            hp = getMazePaths(sr,sc+1,dr,dc);
        }
        if(sr<dr){
            vp = getMazePaths(sr+1,sc,dr,dc);
        }
        ArrayList<String> path = new ArrayList<>();
        for(String p : hp){
            path.add("h"+p);
        }
        for(String p : vp){
            path.add("v"+p);
        }
        return path;
    }

}
