abstract class Vaccine {
    int age;
    String nationality;
    boolean firstDoseTaken = false;

    Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    void firstDose() {
        if (nationality.equalsIgnoreCase("Indian") && age >= 18) {
            System.out.println("Your First dose Successfully Done. Now you have to pay 250 Rs");
            firstDoseTaken = true;
        } else {
            System.out.println("You are not eligible for first dose");
        }
    }

    void secondDose() {
        if (firstDoseTaken) {
            System.out.println("Your Second dose Successfully Done");
        } else {
            System.out.println("Please complete first dose before taking second dose");
        }
    }

    abstract void boosterDose();
}

class VaccinationSuccessful extends Vaccine {

    VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    void boosterDose() {
        if (firstDoseTaken) {
            System.out.println("Your Booster dose Successfully Done");
        } else {
            System.out.println("Booster dose not allowed without vaccination");
        }
    }
}

public class Vaccination {
    public static void main(String[] args) {

        VaccinationSuccessful v =
                new VaccinationSuccessful(18, "Indian");

        v.firstDose();
        v.secondDose();
        v.boosterDose();
    }
}
