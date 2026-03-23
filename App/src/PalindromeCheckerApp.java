public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String str = "Madam In Eden Im Adam";

        str = str.replaceAll(" ", "").toLowerCase();

        String rev = new StringBuilder(str).reverse().toString();

        System.out.println(
            str.equals(rev) ? "Palindrome" : "Not Palindrome"
        );
    }
}