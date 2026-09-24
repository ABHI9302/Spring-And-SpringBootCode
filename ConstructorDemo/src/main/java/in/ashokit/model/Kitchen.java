package in.ashokit.model;

public class Kitchen {

    private String foodItemName;
    private String status;

    // Constructor
    public Kitchen(String foodItemName, String status) {
        this.foodItemName = foodItemName;
        this.status = status;
    }

    // Getter for foodItemName
    public String getFoodItemName() {
        return foodItemName;
    }

    // Setter for foodItemName
    public void setFoodItemName(String foodItemName) {
        this.foodItemName = foodItemName;
    }

    // Getter for status
    public String getStatus() {
        return status;
    }

    // Setter for status
    public void setStatus(String status) {
        this.status = status;
    }
}