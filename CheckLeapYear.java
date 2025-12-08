import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();   // take input
        
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("LEAP YEAR");
        } else {
            System.out.println("NOT LEAP YEAR");
        }
    }
}
