/*

1. You are given a string exp representing an expression.
2. You are required to check if the expression is balanced i.e. closing brackets and opening brackets match up well.

e.g.
[(a + b) + {(c + d) * (e / f)}] -> true
[(a + b) + {(c + d) * (e / f)]} -> false
[(a + b) + {(c + d) * (e / f)} -> false
([(a + b) + {(c + d) * (e / f)}] -> false

Constraints

0 

Format

Input

A string str

Output

true or false

Example

Sample Input

[(a + b) + {(c + d) * (e / f)}]

Sample Output

true

*/


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();
    
    Stack<Character> st = new Stack<>();
    
    for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        
        if(ch == '(' || ch =='{' || ch == '['){
            st.push(ch);
        }else if(ch == ')'){
            boolean val = closing(st,'(');
            if(val == false){
                System.out.println(val);
                return;
            }
           
        }else if(ch == '}'){
            boolean val = closing(st,'{');
             if(val == false){
                System.out.println(val);
                return;
            }
        }else if(ch == ']'){
            boolean val = closing(st,'[');
             if(val == false){
                System.out.println(val);
                return;
            }
        }
    }
    if(st.size()==0){
        System.out.println(true);
    }else{
        System.out.println(false);
    }
    
    }
    public static boolean closing(Stack<Character> st , char cor) {
        if(st.size()==0){
            return false;
        }else if(st.peek() != cor){
            return false;
        }else{
            st.pop();
            return true;
        }
    }

}
