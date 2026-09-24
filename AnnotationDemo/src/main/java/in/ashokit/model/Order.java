package in.ashokit.model;

public class Order {
    private int id;
    private String productName;
    private int quantity;
    private String customerEmail;

    public Order() {

    }
    public Order(int id, String customerEmail, String productName, int quantity) {
        this.id = id;
        this.customerEmail = customerEmail;
        this.quantity = quantity;
        this.productName = productName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
}
