package in.ashokit.bean;

import in.ashokit.model.Kitchen;

public class KitchenStatus {

    public Kitchen findKitchenStatus(String orderId) {

        if (orderId.equals("123-456")) {
            return new Kitchen("veg-Starter", "PREPARED");
        } else if (orderId.equals("4223-1133")) {
            return new Kitchen("nonVegStarters", "PREPARING");
        }

        return null;
    }
}