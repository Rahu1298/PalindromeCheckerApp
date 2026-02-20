public class main {
    public static void main ( String [] args ) {
        System.out.println("Welcome to the Palindrome Checker Management System!");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully");

        // String Literal stored in String constant pool
        String word = "madam";

        // // Reverse the string
        // String reversed = "";

        // for (int i = word.length() - 1; i >= 0; i--) {
        //     reversed = reversed + word.charAt(i);//string concatenation using + operator
        // }

        // // Conditional Statement (if-else)
        // if (word.equals(reversed)) //equals() method is used to compare the content of the strings
        // {
        //     System.out.println(word + " is a Palindrome");
        // } else {
        //     System.out.println(word + " is NOT a Palindrome");
        // }

        // Convert String to Character Array
        char[] characters = word.toCharArray();

        boolean isPalindrome = true;

        // Two-Pointer Technique
        int start = 0;
        int end = characters.length - 1;

        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}
