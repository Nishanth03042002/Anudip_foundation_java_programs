class Printer {
    void printDetails(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    void printDetails(int age, String name) {
        System.out.println("Age: " + age + ", Name: " + name);
    }
}

public class Method_overloading {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.printDetails("Nishant", 22);
        p.printDetails(22, "Nishant");
    }
}
