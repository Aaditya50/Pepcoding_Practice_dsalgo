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
        if(sc==dc && sr==dr){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        //horizontal
        ArrayList<String> paths = new ArrayList<>();
        for(int ms=1;ms<=dc-sc;ms++){
            ArrayList<String> hp = getMazePaths(sr,sc+ms,dr,dc);
            for(String h : hp){
                paths.add("h"+ms+h);
            }
        }
        //vertical
        for(int ms=1;ms<=dr-sr;ms++){
            ArrayList<String> vp = getMazePaths(sr+ms,sc,dr,dc);
            for(String v : vp){
                paths.add("v"+ms+v);
            }
        }
        //diagonal
        for(int ms=1;ms<=dc-sc && ms<=dr-sr;ms++){
            ArrayList<String> dp = getMazePaths(sr+ms,sc+ms,dr,dc);
            for(String d : dp){
                paths.add("d"+ms+d);
            }
        }
        return paths;
    }

}
