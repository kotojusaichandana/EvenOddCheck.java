import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Using the conditional operator to check even or odd
        String result = (number % 2 == 0) ? "Even" : "Odd"; // Intentional error: '=' instead of '=='

        // Output the result
        System.out.println("The number is: " + result);

        scanner.close();
    }
}

