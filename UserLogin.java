import java.util.*;
class user
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("USER LOGIN:");
        System.out.println("1.login with Google");
        System.out.println("2.create a new account");
        System.out.println("Enter choice:");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Enter your ID:");
                String id = sc.nextLine();
                System.out.println("Password:");
                String pass = sc.nextLine();
                System.out.println("LOGGED IN SUCCESSFULLY!");
                System.out.println("WELCOME!");
                break;
            
            case 2:
                System.out.println("ID:");
                id = sc.nextLine();
                System.out.println("Password:");
                pass = sc.nextLine();
                System.out.println("LOGGED IN SUCCESSFULLY!");
                System.out.println("WELCOME!");
                break;
            
            default:
                System.out.println("INVALID CHOICE. CHOOSE AGAIN!");
        }
    }    
}
