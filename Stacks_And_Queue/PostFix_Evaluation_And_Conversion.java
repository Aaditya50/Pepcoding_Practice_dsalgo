/*
Constraints
1. Expression is a valid postfix expression
2. The only operators used are +, -, *, /
3. All operands are single digit numbers.

Sample Input:-

264*8/+3-

Sample Output:-
2
((2+((6*4)/8))-3)
-+2/*6483

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
    
    for(int i=0;i<exp.length();i++){
        char optor = exp.charAt(i);
        
        if(optor == '+' || optor == '-' || optor == '*' || optor == '/'){
            int v2 = vs.pop();
            int v1 = vs.pop();
            int val = operation(v1,v2,optor);
            
            vs.push(val);
            
            String is2 = is.pop();
            String is1 = is.pop();
            String ival = "(" + is1 + optor + is2 + ")";
            
            is.push(ival);
            
            String ps2 = ps.pop();
            String ps1 = ps.pop();
            String pval = optor+ps1+ps2;
            
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
