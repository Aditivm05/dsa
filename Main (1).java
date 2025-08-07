/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Stack;
public class Main{
   
    public final int size=5;
    public int[] StackArray=new int[size];
    public int top =-1;
   
   
    public void push(int value){
            if(top==size-1){
                System.out.println("Stack Overflowed! ");
                return;
            }else{
                top++;
                StackArray[top]= value;
                System.out.println(value + "pushed to stack");
            }
        }
    public void pop(){
            if (top==0){
            System.out.println("Stack Underflow!");
            return;
            }else{
            int value = StackArray[top--];
            System.out.println("poped from stack" +value);
            return ;
        }
        }
    public void peek(){
            if(top==0){
                System.out.println("No Element found");
                return;
            }else{
                System.out.println("The element is : " +StackArray);
                return;
    }
    }
   
    public static void main(String[] args) {
Main stack = new Main();
stack.push(1);
stack.push(2);
stack.push(7);
stack.push(15);
stack.push(4);
stack.pop();
stack.peek();

}
     }
