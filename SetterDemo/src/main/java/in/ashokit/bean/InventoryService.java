package in.ashokit.bean;

import java.util.Map;

public class InventoryService {

    private Map<String, Integer> stock = Map.of(
            "oneplusce6", 8,
            "iphone17", 5,
            "vivox13", 15
    );

    public boolean isInStock(String skuCode, int requiredQuantity) {
        return stock.getOrDefault(skuCode, 0) >= requiredQuantity;
    }
}