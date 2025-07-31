import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (MM/dd/yyyy): ");
        String input = scanner.nextLine();

        // Define input and output formats
        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("dd MMM yyyy");

        try {
            LocalDate date = LocalDate.parse(input, inputFormat);
            String formattedDate = date.format(outputFormat);
            System.out.println("Formatted date: " + formattedDate);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please use MM/dd/yyyy.");
        }

        scanner.close();
    }
}

