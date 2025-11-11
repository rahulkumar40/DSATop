/*
 In an e-commerce or job portal project, you may have different payment methods — Credit Card, UPI, NetBanking, Wallet, PayPal, etc.
 */

abstract class Payment {
    abstract void pay(double amount);
}

class CreaditCardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " Using Credit Card");
    }
}

class UPIPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

public class Main {
    public static void main(String[] args) {
        Payment payment = new UPIPayment();
        payment.pay(15000.00);
    }
}

/*
 * ✅ Where polymorphism helps:
 * 
 * You can easily add new payment types (e.g., PayPal) without touching existing
 * code.
 * 
 * The same method call (pay()) works for different payment objects.
 * 
 * This supports Open/Closed Principle (open for extension, closed for
 * modification).
 */