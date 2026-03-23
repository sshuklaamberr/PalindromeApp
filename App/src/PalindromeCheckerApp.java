import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>();
        String str = "madam";

        for(char c : str.toCharArray()) {
            list.add(c);
        }

        boolean flag = true;
        while(list.size() > 1) {
            if(list.removeFirst() != list.removeLast()) {
                flag = false;
                break;
            }
        }

        System.out.println(flag ? "Palindrome" : "Not Palindrome");
    }
}