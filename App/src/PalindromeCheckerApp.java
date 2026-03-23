class PalindromeService {

    boolean check(String str) {
        String rev = new StringBuilder(str).reverse().toString();
        return str.equals(rev);
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        PalindromeService service = new PalindromeService();

        String str = "madam";

        System.out.println(
            service.check(str) ? "Palindrome" : "Not Palindrome"
        );
    }
}