interface PalindromeStrategy {
    boolean check(String str);
}

class StackStrategy implements PalindromeStrategy {

    public boolean check(String str) {
        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : str.toCharArray())
            stack.push(c);

        String rev = "";

        while (!stack.isEmpty())
            rev += stack.pop();

        return str.equals(rev);
    }
}

class DequeStrategy implements PalindromeStrategy {

    public boolean check(String str) {
        java.util.ArrayDeque<Character> deque = new java.util.ArrayDeque<>();

        for (char c : str.toCharArray())
            deque.add(c);

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast()))
                return false;
        }
        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        PalindromeStrategy strategy = new StackStrategy();

        String str = "madam";

        if (strategy.check(str))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}