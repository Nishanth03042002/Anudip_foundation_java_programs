interface Payment {
    void pay(double amount);
}

class GooglePay implements Payment {
    public void pay(double amount) {
        System.out.println("Payment of $" + amount + " made using Google Pay");
    }
}

class PhonePe implements Payment {
    public void pay(double amount) {
        System.out.println("Payment of $" + amount + " made using PhonePe");
    }
}

public class interface1 {
    public static void main(String[] args) {

        Payment p1 = new GooglePay();
        p1.pay(500);

        Payment p2 = new PhonePe();
        p2.pay(1000);
    }
}
