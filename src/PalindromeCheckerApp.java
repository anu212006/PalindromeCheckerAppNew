class PalindromeService {

    boolean checkPalindrome(String str) {
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        return str.equals(rev);
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        PalindromeService service = new PalindromeService();

        String str = "madam";

        if (service.checkPalindrome(str))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}