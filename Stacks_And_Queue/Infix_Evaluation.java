
/*
Constraints
1. Expression is balanced
2. The only operators used are +, -, *, /
3. Opening and closing brackets - () - are used to impact precedence of operations
4. + and - have equal precedence which is less than * and /. * and / also have equal precedence.
5. In two operators of equal precedence give preference to the one on left.
6. All operands are single digit numbers.

Sample Input
2 + 6 * 4 / 8 - 3

Sample Output
2

*/


import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    Stack<Integer> opnds = new Stack<>();
    Stack<Character> optors = new Stack<>();
    
    for(int i=0;i<exp.length();i++){
        char ch = exp.charAt(i);
        
        if(ch == '('){
            optors.push(ch);
        }else if(Character.isDigit(ch)){
            opnds.push(ch-'0');
        }else if(ch == ')'){
            while(optors.size() > 0 && optors.peek() != '('){
                char optor = optors.pop();
                int v2 = opnds.pop();
                int v1 = opnds.pop();
                
                int opv = operation(v1,v2,optor);
                opnds.push(opv);
            }
            optors.pop();
        }else if(ch == '+'|| ch == '-' || ch == '*' ||ch == '/'){
            while(optors.size() >0 && optors.peek() != '('&& precedence(ch) <= precedence(optors.peek() ) ){
                char optor = optors.pop();
                int v2 = opnds.pop();
                int v1 = opnds.pop();
                
                int opv = operation(v1,v2,optor);
                opnds.push(opv);
            }
            optors.push(ch);
        }
    }
            while(optors.size() > 0){
                char optor = optors.pop();
                int v2 = opnds.pop();
                int v1 = opnds.pop();
                
                int opv = operation(v1,v2,optor);
                opnds.push(opv);
            }
            int val = opnds.pop();
            System.out.println(val);
    
 }
 
 public static int precedence(char optors){
     if(optors == '+'){
         return 1;
     }else if(optors == '-'){
         return 1;
     }else if(optors == '*'){
         return 2;
     }else{
         return 2;
     }
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
