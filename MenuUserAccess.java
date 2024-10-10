import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CanteenManagementApp {
    private static Map<String, Double> menu = new HashMap<>();
    
    static {
        menu.put("Burger", 50.0);
        menu.put("Pizza", 100.0);
        menu.put("Pasta", 80.0);
        menu.put("Soda", 30.0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("Canteen Management App");
            System.out.println("1. View Items");
            System.out.println("2. View Prices");
            System.out.println("3. Order Item");
            System.out.println("4. Payment");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    viewItems();
                    break;
                case 2:
                    viewPrices();
                    break;
                case 3:
                    orderItem(scanner);
                    break;
                case 4:
                    payment(scanner);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
        
        scanner.close();
    }

    private static void viewItems() {
        System.out.println("Available Items:");
        for (String item : menu.keySet()) {
            System.out.println(item);
        }
    }

    private static void viewPrices() {
        System.out.println("Item Prices:");
        for (Map.Entry<String, Double> entry : menu.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static void orderItem(Scanner scanner) {
        System.out.print("Enter item name to order: ");
        String item = scanner.next();
        if (menu.containsKey(item)) {
            System.out.println("You have ordered: " + item);
        } else {
            System.out.println("Item not found.");
        }
    }

    private static void payment(Scanner scanner) {
        System.out.print("Select payment method (1. Cash on Delivery, 2. UPI): ");
        int paymentMethod = scanner.nextInt();
        if (paymentMethod == 1) {
            System.out.println("Payment will be collected on delivery.");
        } else if (paymentMethod == 2) {
            System.out.print("Enter UPI ID: ");
            String upiId = scanner.next();
            System.out.println("Payment initiated to UPI ID: " + upiId);
        } else {
            System.out.println("Invalid payment method.");
        }
    }
}
