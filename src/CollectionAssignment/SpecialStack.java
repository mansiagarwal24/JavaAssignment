/*
    Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull() and an additional operation getMin()
    which should return minimum element from the SpecialStack. (Expected complexity  O(1))
 */
package CollectionAssignment;

import java.util.Scanner;

public class SpecialStack {

    private int top;
    private int size = 5;
    private int minElement;

    int[] stk = new int[size];

    public SpecialStack() {
        top = -1;
        minElement=0;
    }

    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(top == size-1){
            return true;
        }
        return false;
    }

    public void push(int ele){
        if(isEmpty()){
            stk[++top] = ele;
            minElement=ele;
        }else if(ele >= minElement){
            stk[++top] = ele;
        }else{
            stk[++top]=2 * ele - minElement;
            minElement = ele;
        }
        System.out.println(ele + " pushed into stack");
    }

    public int pop(){
        if(!isEmpty()){
            int ele = stk[top--];
            return ele;
        }
        return -1;
    }
    int peekelement()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = stk[top];
            System.out.println("Top element of stack is:"+x);
            return x;
        }
    }

    public int getMin()
    {
        if(!isEmpty())
            return minElement;
        else
            return -1;
    }

    void print(){
        for(int i = top; i>-1 ;i--){
            System.out.print(" "+ stk[i]);
        }
        System.out.println();
    }

    public static void main(String[] args){
        SpecialStack stk = new SpecialStack();
        stk.push(4);
        stk.push(6);
        stk.push(8);
        stk.push(3);
        stk.push(1);
        System.out.print("Elements present in stack :");
        stk.print();
        //stk.push(1);
        System.out.println("The minimum element of stack is:"+ stk.getMin());
        System.out.println(stk.pop() + " Popped from stack");
        System.out.println(stk.pop() + " Popped from stack");
        System.out.print("Elements present in stack :");
        stk.print();
        stk.peekelement();
        System.out.print("Elements present in stack :");
        stk.print();
        System.out.println("The minimum element of stack is:"+ stk.getMin());
    }
}
