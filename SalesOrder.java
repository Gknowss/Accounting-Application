import java.util.Date;
import java.util.List;

public class SalesOrder {
    private String orderId;
    private String customerId;
    private Date orderDate;
    private List<SalesOrderItem> items;
    private double totalAmount;

    // Constructor
    public SalesOrder(String orderId, String customerId, Date orderDate, List<SalesOrderItem> items) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.items = items;
        this.totalAmount = calculateTotalAmount();
    }

    // Method to calculate total amount
    private double calculateTotalAmount() {
        double total = 0;
        for (SalesOrderItem item : items) {
            total += item.getQuantity() * item.getUnitPrice();
        }
        return total;
    }

    // Getters and Setters
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public List<SalesOrderItem> getItems() {
        return items;
    }

    public void setItems(List<SalesOrderItem> items) {
        this.items = items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    // end Getters and Setters

}

class SalesOrderItem {
    private String description;
    private int quantity;
    private double unitPrice;

    public SalesOrderItem(String description, int quantity, double unitPrice) {
        super();
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    // getter and setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    // end Getters and Setters
}
