




import java.util.Scanner;

public class AdminLogin {

    // Hardcoded admin credentials
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "password123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for username
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        // Prompt user for password
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Check credentials
        if (authenticate(username, password)) {
            System.out.println("Login successful! Welcome, admin.");
        } else {
            System.out.println("Login failed. Incorrect username or password.");
        }

        scanner.close();
    }

    private static boolean authenticate(String username, String password) {
        return ADMIN_USERNAME.equals(username) && ADMIN_PASSWORD.equals(password);
    }
}


