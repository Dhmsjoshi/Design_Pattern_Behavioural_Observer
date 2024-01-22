package Design_Pattern_Behavioural_Observer;

public class Client {
    public static void main(String[] args) {
        Amazon a = Amazon.getInstance(); // publisher
        CustomerNotifier customerNotifier = new CustomerNotifier();//Subscriber
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();//Subscriber
        InventoryManager inventoryManager = new InventoryManager();//Subscriber
        CashBackGenerator cashBackGenerator = new CashBackGenerator();
        a.orderPlaced();
        a.deRegisterOrderPlaceSubscriber(cashBackGenerator);
        System.out.println("_________________");
        a.orderPlaced();

    }
}
