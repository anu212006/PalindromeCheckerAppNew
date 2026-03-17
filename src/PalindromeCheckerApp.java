import java.util.ArrayDeque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String str = "racecar";
        ArrayDeque<Character> deque = new ArrayDeque<>();

        for(char c : str.toCharArray()) {
            deque.add(c);
        }

        boolean isPalindrome = true;

        while(deque.size() > 1) {
            if(!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}