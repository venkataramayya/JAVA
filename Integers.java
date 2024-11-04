import java.util.Scanner;

public class Integers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the number of rows (or type 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            Integer rows;
            try {
                rows = Integer.valueOf(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'exit' to quit.");
                continue;
            }

            Integer spaces = rows - 1;
            for (Integer i = 1; i <= rows; i++) {
                for (Integer j = 1; j <= spaces; j++) {
                    System.out.print(" ");
                }
                for (Integer k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
                spaces--;
            }
        }

        scanner.close();
    }
}
