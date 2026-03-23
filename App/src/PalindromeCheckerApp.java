public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String str = "madam";
        char[] arr = str.toCharArray();

        boolean flag = true;
        for(int i = 0; i < arr.length/2; i++) {
            if(arr[i] != arr[arr.length-1-i]) {
                flag = false;
                break;
            }
        }

        System.out.println(flag ? "Palindrome" : "Not Palindrome");
    }
}