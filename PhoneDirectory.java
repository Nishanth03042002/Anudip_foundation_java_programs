import java.util.HashMap;
import java.util.Scanner;
public class PhoneDirectory {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Find number");
            System.out.println("2. Add number");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline
            switch (choice) {
                case 1:
                    System.out.print("Enter name to find number: ");
                    String findName = sc.nextLine();
                    if (phoneBook.containsKey(findName)) {
                        System.out.println("Phone number for " + findName + ": " + phoneBook.get(findName));
                    } else {
                        System.out.println("Name not found");
                    }
                    break;
                case 2:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter phone number: ");
                    String number = sc.nextLine();
                    phoneBook.put(name, number);
                    System.out.println("Added " + name + " to phone book.");
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } while (choice != 3);
        sc.close();
    }
}
