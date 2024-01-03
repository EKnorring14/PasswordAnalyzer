import java.util.Scanner;

public class passwordanalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the password to analyze:");
        String password = scanner.nextLine();

        if (isStrongPassword(password)) {
            System.out.println("Password is strong!");
        } else {
            System.out.println("Password is weak. Please improve it.");
        }
    }

    private static boolean isStrongPassword(String password) {
        // Minimum length requirement
        if (password.length() < 8) {
            System.out.println("Password must be at least 8 characters long.");
            return false;
        }

        // Check for uppercase letters
        if (!password.matches(".*[A-Z].*")) {
            System.out.println("Password must contain at least one uppercase letter.");
            return false;
        }

        // Check for lowercase letters
        if (!password.matches(".*[a-z].*")) {
            System.out.println("Password must contain at least one lowercase letter.");
            return false;
        }

        // Check for digits
        if (!password.matches(".*\\d.*")) {
            System.out.println("Password must contain at least one digit.");
            return false;
        }

        // Check for special characters
        if (!password.matches(".*[!@#$%^&*()-+=].*")) {
            System.out.println("Password must contain at least one special character.");
            return false;
        }

        // If all criteria are met, the password is considered strong
        return true;
    }
}