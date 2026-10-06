package in.ashokit.bean;

import in.ashokit.model.Delivery;
import in.ashokit.model.Kitchen;

public class DeliveryStatus {

    public  Delivery findDeliveryStatus(String orderId){
        if(orderId.equals("123-456"))
            return new Delivery("PICKED-UP","12:10 PM");
        else if(orderId.equals("4223-1133"))
            return new Delivery("ENROUTE", "11:57AM");
        else
        return null;
    }
}
