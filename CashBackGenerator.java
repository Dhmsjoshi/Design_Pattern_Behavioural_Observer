package Design_Pattern_Behavioural_Observer;

public class CashBackGenerator implements OrderPlacedSubscriber{

    public CashBackGenerator() {
        Amazon a = Amazon.getInstance();
        a.registerOrderPlaceSubscriber(this);
    }

    @Override
    public Returndata orderPlaceEvent() {
        Returndata data = new Returndata("CashBack");
        System.out.println("Cashback is being generated.");
        return data;
    }
}
