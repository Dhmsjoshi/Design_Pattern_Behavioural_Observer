package Design_Pattern_Behavioural_Observer;

import Overloading.A;

import java.util.ArrayList;
import java.util.List;

public class Amazon {// publisher -> Where the event actually heppens
    private static Amazon instance;
    private List<OrderPlacedSubscriber> orderPlacedSubscribers;

    public Amazon() {
        this.orderPlacedSubscribers = new ArrayList<>();
    }

    public static Amazon getInstance(){
        if(instance==null){
            synchronized (Amazon.class){
                if(instance==null){
                    instance = new Amazon();
                }
            }
        }
        return instance;
    }

    public void orderPlaced(){ // Event method
        /*  CustomerNotifier customerNotifier = new CustomerNotifier();
            customerNotifier.orderPlaceEvent();
            InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
            invoiceGenerator.orderPlaceEvent();
            InventoryManager inventoryManager = new InventoryManager();
            invoiceGenerator.orderPlaceEvent();
        */

        //Instead od doing above things, due to observer design pattern, we'll do followig:
        // We have a list of subscriber in here amazon class

        for(OrderPlacedSubscriber orderPlacedSubscriber : orderPlacedSubscribers){
            orderPlacedSubscriber.orderPlaceEvent();
        }



    }

    public void registerOrderPlaceSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscribers.add(orderPlacedSubscriber);
    }

    public void deRegisterOrderPlaceSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscribers.remove(orderPlacedSubscriber);
    }
}
