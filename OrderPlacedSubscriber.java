package Design_Pattern_Behavioural_Observer;

public interface OrderPlacedSubscriber {// Structure of a subscriber
    Returndata orderPlaceEvent(); // Action that we need to perform when orderplace event is consumed.

    //Any class that whants to become a subscriber for orderplace event
    // Or wants to consume orderplace event
    // Then that class should implement the interface
}
