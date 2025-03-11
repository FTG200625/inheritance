import payment.*;

public class Main {
    public static void main(String[] args) {

        RegularCustomer customer1 = new RegularCustomer("Yasamin");
        RegularCustomer customer2 = new RegularCustomer("Sara");

        PremiumCustomer customer3 = new PremiumCustomer("Yekta");

        CreditCardPayment creditCard = new CreditCardPayment("6219-8619-5463-6780", "Yasamin");
        PayPalPayment payPal = new PayPalPayment("SARA@gmail.com");
        BitcoinPayment bitCoin = new BitcoinPayment("2g4t67fdtuln7dvjgt53vhjj7j7pqzx4");

        customer1.displayCustomerInfo();
        customer2.displayCustomerInfo();
        customer3.displayCustomerInfo();

        System.out.println();

        customer1.makePayment(creditCard, 313);
        customer1.makePayment(creditCard, 599.99);

        customer2.makePayment(payPal, 1000);
        customer2.makePayment(payPal, 899.99);

        customer3.makePayment(bitCoin, 820);
        customer3.makePayment(bitCoin, 499.99);

        System.out.println("***Yasamin***");
        customer1.showPaymentHistory();
        System.out.println("***Sara***");
        customer2.showPaymentHistory();
        System.out.println("***Yekta***");
        customer3.showPaymentHistory();
    }
}