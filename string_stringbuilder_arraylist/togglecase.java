import java.io.*;
import java.util.*;

public class Main {

	public static StringBuffer toggleCase(String str){
		//write your code here
		StringBuffer newStr=new StringBuffer(str);    
		for(int i=0;i<str.length();i++){
		     if(Character.isLowerCase(str.charAt(i))) {
		          newStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));  
		     } 
		       else if(Character.isUpperCase(str.charAt(i))) {    
                newStr.setCharAt(i, Character.toLowerCase(str.charAt(i)));    
            }    
		}

		return newStr;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}
