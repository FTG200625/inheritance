package payment;

public class CreditCardPayment implements PaymentStrategy{
    String cardNumber;
    String cardHolderName;

    //methods...
    public CreditCardPayment (String newCardNumber, String newCardHolderName){
        cardNumber = newCardNumber;
        cardHolderName = newCardHolderName;
    }

    @Override
    public void pay(double amount) {
        System.out.println("paid "+amount+" . Details: ");
        System.out.println("    "+getPaymentDetails());
    }

    @Override
    public String getPaymentDetails() {
        return "used Credit Card...    ~Credit Card Number: "+cardNumber+"      ~Holder: "+cardHolderName;
    }
}
