package schoolSystem;

import java.util.Scanner;

public class PasswordLoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "java123";
        String enteredPassword = "";

        // Keep prompting until the correct password is entered
        while (!enteredPassword.equals(correctPassword)) {
            System.out.print("Enter password: ");
            enteredPassword = scanner.nextLine();
        }

        System.out.println("Login Successful");
        scanner.close();
    }
}
