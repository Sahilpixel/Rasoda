

import java.util.ArrayList;
import java.util.Scanner;

class MenuItem {
    String name;
    double price;

    MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class CanteenManagement {
    private static ArrayList<MenuItem> menuItems = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Admin Menu:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Edit Price");
            System.out.println("4. Update Item");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addItem(scanner);
                    break;
                case 2:
                    removeItem(scanner);
                    break;
                case 3:
                    editPrice(scanner);
                    break;
                case 4:
                    updateItem(scanner);
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

    private static void addItem(Scanner scanner) {
        System.out.print("Enter item name: ");
        String name = scanner.nextLine();
        System.out.print("Enter item price: ");
        double price = scanner.nextDouble();
        menuItems.add(new MenuItem(name, price));
        System.out.println("Item added successfully.");
    }

    private static void removeItem(Scanner scanner) {
        System.out.print("Enter item name to remove: ");
        String name = scanner.nextLine();
        menuItems.removeIf(item -> item.name.equalsIgnoreCase(name));
        System.out.println("Item removed successfully.");
    }

    private static void editPrice(Scanner scanner) {
        System.out.print("Enter item name to edit price: ");
        String name = scanner.nextLine();
        for (MenuItem item : menuItems) {
            if (item.name.equalsIgnoreCase(name)) {
                System.out.print("Enter new price: ");
                item.price = scanner.nextDouble();
                System.out.println("Price updated successfully.");
                return;
            }
        }
        System.out.println("Item not found.");
    }

    private static void updateItem(Scanner scanner) {
        System.out.print("Enter item name to update: ");
        String name = scanner.nextLine();
        for (MenuItem item : menuItems) {
            if (item.name.equalsIgnoreCase(name)) {
                System.out.print("Enter new item name: ");
                item.name = scanner.nextLine();
                System.out.print("Enter new item price: ");
                item.price = scanner.nextDouble();
                System.out.println("Item updated successfully.");
                return;
            }
        }
        System.out.println("Item not found.");
    }
}


