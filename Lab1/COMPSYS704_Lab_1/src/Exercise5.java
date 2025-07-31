import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        try {
            int input = scanner.nextInt();
            int reversed = reverseDigits(input);
            System.out.println("Reversed number: " + reversed);
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }

    public static int reverseDigits(int number) {
        int reversed = 0;
        int sign = number < 0 ? -1 : 1;
        number = Math.abs(number);

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return sign * reversed;
    }
}
