import java.util.Scanner;

public class Converter
{
    public static boolean isOperand(char c){
        if(
            (c>= 'a' && c<= 'z') ||
            (c>= 'A' && c<= 'Z') ||
            (c>= '0' && c<= '9')){
                return true;
        }else{
            return false;
        }
    }
         public static int precedenceOrder(char c){
    if(c == '*' || c == '/' ){
      return 2;
    }else {
      return 1;
    }
  }
    public static boolean isOperator(char c){
        return c=='+' || c=='-' || c=='*' || c=='/';
    }

    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        CharStack opstack = new CharStack();
        
        System.out.println("Please type a mathmatical equation: ");
        String line = scan.nextLine();
        boolean error = false;
        
        for(int i=0; i<line.length(); i++){
      char current = line.charAt(i);
      if(current == '('){ 
        opstack.push(current);
      }
      else if(current == ')'){ 
      opstack.pop();
          }
      else if (isOperand(current) == true){
            System.out.print(current);
        }
        else if(isOperator(current) == true){
            if(precedenceOrder(current) ==2){
                System.out.print(current);
            }else{
                if(opstack.isEmpty()){
                opstack.push(current);
            }else{
                char operator = opstack.pop();
                System.out.print(operator);
            }
        }
      }
      if (opstack.isEmpty() == false){
      System.out.print(opstack.pop());
      }
      }
    }
}
      

