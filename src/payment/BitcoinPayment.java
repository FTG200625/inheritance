package payment;

public class BitcoinPayment implements PaymentStrategy{
    String walletAddress;

    //methods...
    public BitcoinPayment (String newWalletAddress){
        walletAddress = newWalletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid "+amount+". Details:");
        System.out.println("    "+getPaymentDetails());
    }

    @Override
    public String getPaymentDetails() {
        return "Used Bitcoin...   ~WalletAddress: "+walletAddress;
    }
}
