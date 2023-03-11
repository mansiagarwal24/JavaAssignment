/*
    Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull() and an additional operation getMin()
    which should return minimum element from the SpecialStack. (Expected complexity  O(1))
 */
package CollectionAssignment;

import java.util.Scanner;
import java.util.Stack;

class SpecialStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    SpecialStack() {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    boolean isEmpty() {
        return stack.isEmpty();
    }

    boolean isFull() {
        return false;
    }

    void push(int ele) {
        stack.push(ele);
        System.out.println("item is pushed");
        if (minStack.isEmpty() || ele <= minStack.peek()) {
            minStack.push(ele);
        }
    }


    int pop() {
        if (minStack.isEmpty()) {
            System.out.println("Stack is empty");
        }
        int popEle = stack.pop();
        if (popEle == minStack.peek()) {
            minStack.pop();
        }
        System.out.println("pooped item is:" + popEle);
        return popEle;
    }


    public int getMin() {
        if (minStack.isEmpty()) {
            System.out.println("Stack is empty");
        }
        return minStack.peek();
    }

    void print(){
        System.out.println(stack);
    }
}
public class Ques3 {
        public static void main(String[] args) {
            SpecialStack stk = new SpecialStack();
            Scanner scan = new Scanner(System.in);
            int input;
            System.out.println("1.push\n2.pop\n3.Minimum element\n4.isFull\n5.isEmpty\n6.print stack");
            do {
                System.out.println("Enter your choice:");
                input = scan.nextInt();
                switch (input) {
                    case 1-> {
                        System.out.println("Enter the item to be push");
                        stk.push(scan.nextInt());
                    }

                    case 2 -> stk.pop();

                    case 3-> System.out.println("Minimum element of stack is: "+ stk.getMin());

                    case 4-> System.out.println(stk.isFull());

                    case 5-> System.out.println(stk.isEmpty());
                    case 6-> stk.print();
                }
            } while (input < 7);
        }
}
