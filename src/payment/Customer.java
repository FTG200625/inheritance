package payment;

import java.util.ArrayList;

public abstract class Customer {
    String name;
    ArrayList<String> paymentHistory;

    //methods...
    public Customer (String newName){
        name = newName;
        paymentHistory = new ArrayList<>();
    }

    public abstract void displayCustomerInfo ();

    public void makePayment(PaymentStrategy paymentStrategy, double amount){
        paymentStrategy.pay(amount);
        paymentHistory.add("Amount: "+amount+"  "+paymentStrategy.getPaymentDetails());
    }

    public void showPaymentHistory (){
        System.out.println("Payment history for "+name+":");
        for (String payment : paymentHistory)
            System.out.println(payment);
    }
}
