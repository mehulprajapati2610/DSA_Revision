/*
 * PROBLEM: Min Stack
 * STATEMENT: Aapko ek aisa custom Stack design karna hai jo normal operations (push, pop, top) ke saath-saath stack ka MINIMUM element bhi return kare. Aur sabse bada twist yeh hai ki saare operations—push, pop, top, aur getMin—hamesha O(1) constant time mein chalne chahiye!
 * OPERATIONS TO IMPLEMENT:
 * - MinStack() : Stack ko initialize karega.
 * - void push(int val) : Element ko stack ke upar daalega.
 * - void pop() : Sabse upar wale element ko hataega.
 * - int top() : Sabse upar wale element ko sirf dikhaega (peek).
 * - int getMin() : Poore stack mein jo sabse chota element hai use O(1) mein nikaal kar dega.
 */

import java.util.Stack;

class OperationMinStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;

    public OperationMinStack() {
        mainStack = new Stack<> ();
        minStack = new Stack<> ();
    }

    public void push(int val) {
        mainStack.push ( val );

        if (minStack.isEmpty ()) {
            minStack.push ( val );
        } else {
            minStack.push ( Math.min ( val, minStack.peek () ) );
        }
    }

    public void pop() {
        if (!mainStack.isEmpty ()) {
            mainStack.pop ();
            minStack.pop ();
        }
    }

    public int top() {
        return mainStack.peek ();
    }

    public int getMin() {
        return minStack.peek ();
    }
}

public class MinStack {
    public static void main(String[] args) {
        OperationMinStack stack = new OperationMinStack ();
        stack.push ( 5 );
        stack.push ( 3 );
        stack.push ( 7 );

        System.out.println ( "current min: " + stack.getMin () );

        stack.pop ();
        stack.pop ();

        System.out.println ( "current top: " + stack.top () );
        System.out.println ( "current min: " + stack.getMin () );
    }
}
