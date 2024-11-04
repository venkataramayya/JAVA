import java.util.Scanner;

public class longnum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the number of rows (or type 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            long rows;
            try {
                rows = Long.parseLong(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'exit' to quit.");
                continue;
            }

            long spaces = rows - 1;
            for (long i = 1; i <= rows; i++) {
                for (long j = 1; j <= spaces; j++) {
                    System.out.print(" ");
                }
                for (long k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
                spaces--;
            }
        }

        scanner.close();
    }
}
