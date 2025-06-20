import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 11, 15, 0, 12, 5};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to divide: ");
        int num = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            try {
                int result = num / arr[i];
                System.out.println(num + " / " + arr[i] + " = " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero at index " + i);
            }
        }

        sc.close();
    }
}
