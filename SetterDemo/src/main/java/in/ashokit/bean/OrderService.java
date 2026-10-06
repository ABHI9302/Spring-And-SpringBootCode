package in.ashokit.bean;

//target class
public class OrderService {

    InventoryService inventoryService;

    public void setInventoryService(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    public void placeOrder(String skuCode, int requiredQuantity) {
        boolean flag = inventoryService.isInStock(skuCode, requiredQuantity);

        if (flag)
            System.out.println("Order Placed Successfully");
        else
            System.out.println("Out of Stock, Please try later");
    }
}