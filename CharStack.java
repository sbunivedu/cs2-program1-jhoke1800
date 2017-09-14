public class CharStack
{
  private final int MAX_CAP = 100;
  private int top; //location of top item on the stack
  private char [] s; //The stack

  public CharStack(){
    //PRE: none
    //POS: none
    //TAS: Create an empty stack with a default capacity
    s = new char[MAX_CAP];
    top = -1;
  }

  public void push(char element){
    //PRE: have items to add to the stack
    //POS: none
    //TAS: Add a new item to the stack
    top ++;
    s[top] = element;
  }

  public char pop(){
    //PRE: have a stack with elements
    //POS: none
    //TAS: remove and return the item on the top of the stack
    char result = s[top];
    top--;
    return result;
  }
  
  public char peek(){
    //PRE: have a stack
    //POS: none
    //TAS: look at the top of the stack
    return s[top];
  }

  public boolean isEmpty(){
    //PRE: none
    //POS:none
    //TAS: Return whether or not the stack is empty. HINT: look
    //     at the constructor.
    if(top==-1){
    return true;
    }
    else{
      return false;
    }
  }

  public boolean isFull(){
    //PRE: none
    //POS:none
    //TAS: return whether or not the stack is full
    return top == MAX_CAP-1;
  }


public String toString(){
   //PRE:have a stack
    //POS:none
    //TAS:show everything in the stack
 String result="";
 for(int i=0;i<top+1;i++){
   result = result + s[i] + " ";
  }
return result;
}
}