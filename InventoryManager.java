package Design_Pattern_Behavioural_Observer;

public class InventoryManager implements OrderPlacedSubscriber{

    public InventoryManager() {
        Amazon a = Amazon.getInstance();
        a.registerOrderPlaceSubscriber(this);
    }
    //Whenever somebudy creates a coustomerNotifier object, they automatically get registered as order placed subscriber
    //As developer might miss everytime register or deRegister a subscriber, which can lead to errors.
    @Override
    public Returndata orderPlaceEvent() {
        Returndata data = new Returndata("Inventory updated");
        System.out.println("Inventory being updated");
        return data;
    }
}
