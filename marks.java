public class marks{
    public static void main(String[] args) {
        int mark = 25;
        if (mark >= 91 && mark <= 100) {
            System.out.println("Distinction");
        } else if (mark >= 81 && mark <= 90) {
            System.out.println("Distinction");
        } else if (mark >= 61 && mark <= 80) {
            System.out.println("first class");
        } else if (mark >= 41 && mark <= 60) {
            System.out.println("Second class");
        } else if (mark >= 35 && mark <= 40) {
            System.out.println("Pass");
        }
        else if (mark>=0 && mark <=34){
            System.out.println("Fail");
        }
        else {
            System.out.println("Invalid marks");
        }
    }
}