public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC1
        System.out.println("Welcome to Palindrome Checker App");

        // UC2 - Hardcoded Palindrome
        String str = "madam";
        String rev = "";

        for(int i = str.length()-1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if(str.equals(rev)) {
            System.out.println(str + " is Palindrome");
        } else {
            System.out.println(str + " is Not Palindrome");
        }
    }
}