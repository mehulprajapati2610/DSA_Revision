/*
 * PROBLEM: Implement Queue using Stacks
 * STATEMENT: Do Stacks ka use karke ek FIFO (First In, First Out) Queue design karo. Aapko Queue ke saare standard functions implement karne hain:
 * - void push(int x) : Element x ko queue ke peeche (end) daalega.
 * - int pop() : Queue ke sabse aage (front) se element hataega aur return karega.
 * - int peek() : Queue ke sabse aage wale element ko bina hataye sirf dikhaega.
 * - boolean empty() : Agar queue khali hai toh true, nahi toh false return karega.
 */

import java.util.Stack;

class MyQueue {
    private Stack<Integer> input;
    private Stack<Integer> output;

    public MyQueue() {
        input = new Stack<> ();
        output = new Stack<> ();
    }

    public void push(int val) {
        input.push ( val );
    }

    public int pop() {
        peek ();
        return output.pop ();
    }

    public int peek() {
        if (output.isEmpty ()) {
            while (!input.isEmpty ()) {
                output.push ( input.pop () );
            }
        }
        return output.peek ();
    }

    public boolean empty() {
        return input.isEmpty () && output.isEmpty ();
    }
}

public class QUsingStack {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue ();
        queue.push ( 1 );
        queue.push ( 2 );

        System.out.println ( "Front element: " + queue.peek () );
        System.out.println ( "Popped element: " + queue.pop () );
        System.out.println ( "Is empty: " + queue.empty () );
    }
}
