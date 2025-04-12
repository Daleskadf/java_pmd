package util;

import java.util.Scanner;

public class InputHelper {
    public static String readLine(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static int readInt(Scanner scanner, String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            scanner.nextLine();  // Consume the invalid input
            System.out.print("Please enter a valid number: ");
        }
        int result = scanner.nextInt();
        scanner.nextLine();  // Consume the newline
        return result;
    }
}
