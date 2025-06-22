import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        StringBuilder result = new StringBuilder();
        Set<Character> seen = new LinkedHashSet<>();

        for (char c : input.toCharArray()) {
            if (seen.add(c)) {
                result.append(c);
            }
        }

        System.out.println("String without duplicates: " + result);
        sc.close();
    }
}