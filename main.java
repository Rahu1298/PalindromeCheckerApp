import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class main {
    public static void main ( String [] args ) {
        // System.out.println("Welcome to the Palindrome Checker Management System!");
        // System.out.println("Version : 1.0");
        // System.out.println("System initialized successfully");

        // String Literal stored in String constant pool
        String word = "madam";

        // Reverse the string
        // String reversed = "";

        // for (int i = word.length() - 1; i >= 0; i--) {
        //     reversed = reversed + word.charAt(i);
        // }

        // Conditional Statement (if-else)
        // if (word.equals(reversed)) {
        //     System.out.println(word + " is a Palindrome");
        // } else {
        //     System.out.println(word + " is NOT a Palindrome");
        // }

        // Stack<Character> stack = new Stack<>();

        // // Push characters into stack
        // for (int i = 0; i < word.length(); i++) {
        //     stack.push(word.charAt(i));
        // }

        // boolean isPalindrome = true;

        // // Pop and compare
        // for (int i = 0; i < word.length(); i++) {
        //     char poppedChar = stack.pop();

        //     if (word.charAt(i) != poppedChar) {
        //         isPalindrome = false;
        //         break;
        //     }
        // }

        // if (isPalindrome) {
        //     System.out.println(word + " is a Palindrome");
        // } else {
        //     System.out.println(word + " is NOT a Palindrome");
            
         Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Step 1: Push into stack & Enqueue into queue
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            stack.push(ch);      // LIFO
            queue.add(ch);       // FIFO
        }

        boolean isPalindrome = true;

        // Step 2: Compare pop (stack) with dequeue (queue)
        while (!stack.isEmpty()) {

            char fromStack = stack.pop();      // Reverse order
            char fromQueue = queue.remove();   // Original order

            if (fromStack != fromQueue) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }

        }
    }

