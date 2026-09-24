package in.ashokit.model;

public class Delivery {
    private String deliveryStatus;
    private String eta;

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public String getEta() {
        return eta;
    }

    public void setEta(String eta) {
        this.eta = eta;
    }

    public  Delivery(String deliveryStatus, String eta){
        this.deliveryStatus=deliveryStatus;
        this.eta=eta;

    }
}
