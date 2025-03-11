package payment;

public class PayPalPayment implements PaymentStrategy{
    String email;

    //methods...
    public PayPalPayment (String newEmail){
        email = newEmail;
    }

    @Override
    public void pay(double amount) {
        System.out.println("paid "+amount+". Details: ");
        System.out.println("    "+getPaymentDetails());
    }

    @Override
    public String getPaymentDetails() {
        return "Used PayPal...    ~Email: "+email;
    }
}
