import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        HashSet<String> palindromes = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            
            expandAroundCenter(input, i, i, palindromes);
            
            expandAroundCenter(input, i, i + 1, palindromes);
        }

        System.out.println("Palindromic substrings:");
        for (String p : palindromes) {
            System.out.println(p);
        }

        sc.close();
    }

    static void expandAroundCenter(String s, int left, int right, HashSet<String> result) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            result.add(s.substring(left, right + 1));
            left--;
            right++;
        }
    }
}
