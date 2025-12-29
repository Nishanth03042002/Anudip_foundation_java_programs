class Restaurant {

    private String order;
    private boolean orderPlaced = false;
    private boolean orderCooked = false;

    synchronized void foodOrder(String orderName) {
        while (orderPlaced) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.order = orderName;
        System.out.println("Thread waiter: customer has ordered " + orderName);
        orderPlaced = true;
        notifyAll();
    }

    synchronized void cookedOrder(String orderName) {
        while (!orderPlaced) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread cook: chef has received the order " + orderName);
        System.out.println("Thread cook: cooking under process....");
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread cook: order is ready!!");
        orderCooked = true;
        notifyAll();
    }

    synchronized void receivedOrder(String orderName) {
        while (!orderCooked) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread waiter: food is delivered to customer!!");
        System.out.println("Thread customer: customer has received the order: " + orderName);
        notifyAll();
    }
}

public class ThreadCommunication {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();
        String orderName = "Chicken biryani";

        Thread customer = new Thread(() -> {
            System.out.println("Thread customer: customer is choosing an order....");
            restaurant.receivedOrder(orderName);
        }, "customer");

        Thread waiter = new Thread(() -> {
            restaurant.foodOrder(orderName);
        }, "waiter");

        Thread cook = new Thread(() -> {
            restaurant.cookedOrder(orderName);
        }, "cook");

        customer.start();
        waiter.start();
        cook.start();
    }
}
