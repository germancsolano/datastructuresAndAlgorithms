package Stacks;

public class StackArray {

     static int MAX_ELEMENTS=3;
    public static  int array[] = new int[MAX_ELEMENTS];
    static int top=-1;

    public static void main(String[] args) {
        StackArray.push(10);
        StackArray.push(20);
        StackArray.pop();
        StackArray.push(30);
        StackArray.push(40);
        StackArray.push(40);
        StackArray.pop();
        StackArray.pop();
        StackArray.pop();
        StackArray.pop();

    }
    public static void  push(int val){
        if(top==MAX_ELEMENTS-1){
            System.out.println("STACK is FULL ");
        }else{
            System.out.println("Inserting element: " + val);
            ++top;
            array[top]=val;
        }
    }

    public static void pop(){
        if(top ==-1){
            System.out.println("Stack is empty");
        }else{
            System.out.println("Deleteng element: " + array[top]);
            top--;
        }
    }
}
