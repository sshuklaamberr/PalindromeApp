import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String str = "madam";
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for(char c : str.toCharArray()) {
            stack.push(c);
            queue.add(c);
        }

        boolean flag = true;
        while(!stack.isEmpty()) {
            if(stack.pop() != queue.remove()) {
                flag = false;
                break;
            }
        }

        System.out.println(flag ? "Palindrome" : "Not Palindrome");
    }
}