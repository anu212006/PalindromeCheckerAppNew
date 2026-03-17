public class PalindromeCheckerApp {

    static boolean reverseMethod(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return str.equals(rev);
    }

    public static void main(String[] args) {

        String str = "madam";

        long start = System.nanoTime();
        reverseMethod(str);
        long end = System.nanoTime();

        System.out.println("Execution Time: " + (end - start) + " ns");
    }
}