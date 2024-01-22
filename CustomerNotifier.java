package Design_Pattern_Behavioural_Observer;

public class CustomerNotifier implements OrderPlacedSubscriber{ // Subscriber -> listens to an event and takes some action


    public CustomerNotifier() {
        Amazon a = Amazon.getInstance();
        a.registerOrderPlaceSubscriber(this);
    }
    //Whenever somebudy creates a coustomerNotifier object, they automatically get registered as order placed subscriber
    //As developer might miss everytime register or deRegister a subscriber, which can lead to errors.

    @Override
    public Returndata orderPlaceEvent() {
        Returndata data = new Returndata("Notify the customer regarding order is placed.");
        System.out.println("Notify the customer regarding");
        return data;
    }
}
