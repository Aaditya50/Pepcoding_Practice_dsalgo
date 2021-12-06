/*
Constraints
1. Expression is a valid prefix expression
2. The only operators used are +, -, *, /
3. All operands are single digit numbers.

Sample Input:-
-+2/*6483

Sample Output:-
2
((2+((6*4)/8))-3)
264*8


*/


import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    Stack<Integer> vs = new Stack<>();
    Stack<String> is = new Stack<>();
    Stack<String> ps = new Stack<>();
    
    for(int i=exp.length()-1;i>=0;i--){           // 1st Main Change from postfix 
        char optor = exp.charAt(i);
        
        if(optor == '+' || optor == '-' || optor == '*' || optor == '/'){
            int v1 = vs.pop();                    // 2nd Main change from postfix
            int v2 = vs.pop();
            int val = operation(v1,v2,optor);
            
            vs.push(val);
            
            String is1 = is.pop();                // 3rd Main change from postfix
            String is2 = is.pop();
            String ival = "(" + is1 + optor + is2 + ")";
            
            is.push(ival);
            
            String ps1 = ps.pop();                // 4th Main change from postfix
            String ps2 = ps.pop();
            String pval = ps1 + ps2 + optor;
            
            ps.push(pval);
        }else{
            vs.push(optor -'0');
            is.push(optor + "");
            ps.push(optor + "");
        }
    }
    System.out.println(vs.pop());
    System.out.println(is.pop());
    System.out.println(ps.pop());
    
 }
 public static int operation(int v1, int v2, char optors){
     if(optors == '+'){
         return v1 + v2;
     }else if(optors == '-'){
         return v1 - v2;
     }else if(optors == '*'){
         return v1 * v2;
     }else{
         return v1 / v2;
     } 
 }
}
