class Employee {
    private int id;
    private double salary;
    private String designation;

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public String getDesignation() {
        return designation;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setId(101);
        emp.setSalary(50000);
        emp.setDesignation("Developer");

        System.out.println("ID: " + emp.getId());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Designation: " + emp.getDesignation());
    }
}
