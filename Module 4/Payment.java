interface Payment {
    void pay();
}

class CreditCardPayment implements Payment {
    public void pay() {
        System.out.println("Payment made using Credit Card");
    }
}

class UPIPayment implements Payment {
    public void pay() {
        System.out.println("Payment made using UPI");
    }
}