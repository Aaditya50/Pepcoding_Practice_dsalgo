/*
Constraints
1. Expression is balanced
2. The only operators used are +, -, *, /
3. Opening and closing brackets - () - are used to impact precedence of operations
4. + and - have equal precedence which is less than * and /. * and / also have equal precedence.
5. In two operators of equal precedence give preference to the one on left.
6. All operands are single digit numbers.

Sample Input:-

a*(b-c+d)/e

Sample Output:-

abc-d+*e/
/*a+-bcde

*/


import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    Stack<String> postfix = new Stack<>();
    Stack<String> prefix = new Stack<>();
    Stack<Character> ops = new Stack<>();
    
    for(int i=0;i<exp.length();i++){
        char ch = exp.charAt(i);
        
        if(ch == '('){
            ops.push(ch);
        }else if((ch>='0' && ch<='9') ||
                 (ch>='a' && ch<='z') ||
                 (ch>='A' && ch<='Z')){
            postfix.push(ch + "");
            prefix.push(ch + "");
        }else if(ch == ')'){
            while(ops.size() > 0 && ops.peek() != '('){
                char op = ops.pop();
                
                String postv2 = postfix.pop();
                String postv1 = postfix.pop();
                String postv = postv1+postv2+op;
                
                postfix.push(postv);
                
                String prev2 = prefix.pop();
                String prev1 = prefix.pop();
                String prev = op+prev1+prev2;
                
                prefix.push(prev);
            }
            ops.pop();
            
        }else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
             while( ops.size() > 0 &&
                    ops.peek() != '(' &&
                    precedence(ch) <= precedence(ops.peek())) {
                char op = ops.pop();
                
                String postv2 = postfix.pop();
                String postv1 = postfix.pop();
                String postv = postv1+postv2+op;
                
                postfix.push(postv);
                
                String prev2 = prefix.pop();
                String prev1 = prefix.pop();
                String prev = op+prev1+prev2;
                
                prefix.push(prev);
            }
           ops.push(ch);
        }
    }
            while(ops.size() > 0){
                char op = ops.pop();
                
                String postv2 = postfix.pop();
                String postv1 = postfix.pop();
                String postv = postv1+postv2+op;
                
                postfix.push(postv);
                
                String prev2 = prefix.pop();
                String prev1 = prefix.pop();
                String prev = op+prev1+prev2;
                
                prefix.push(prev);
            }
            System.out.println(postfix.pop());
            System.out.println(prefix.pop());
    

 }
 public static int precedence(char optors){
     if(optors == '+' || optors == '-'){
         return 1;
     }else if(optors == '*' || optors == '/'){
         return 2;
     }else{
         return 0;
     }
 }
}
