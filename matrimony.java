import java.util.Scanner;
public class matrimony {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the gender");
        String gender = s.next();
        System.out.println("Enter the age");
        int age = s.nextInt();
        if (gender.equals("female")){
            if (age>=18){
                System.out.println("Eligible for marriage");
            }
            else{
                System.out.println("Not Elligible");
            }

        }
        else if(gender.equals("male")){
            if (age>=21){
                System.out.println("Eligible for marriage");
            }
            else{
                System.out.println("Not Elligible");
            }       
        }
    }
}
