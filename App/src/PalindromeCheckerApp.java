interface PalindromeStrategy {
    boolean check(String str);
}

class ReverseStrategy implements PalindromeStrategy {
    public boolean check(String str) {
        String rev = new StringBuilder(str).reverse().toString();
        return str.equals(rev);
    }
}

class PalindromeContext {
    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean execute(String str) {
        return strategy.check(str);
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        PalindromeContext context = new PalindromeContext();
        context.setStrategy(new ReverseStrategy());

        String str = "madam";

        System.out.println(
            context.execute(str) ? "Palindrome" : "Not Palindrome"
        );
    }
}