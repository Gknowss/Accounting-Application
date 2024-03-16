import java.util.Date;
import java.util.List;

public class PurchaseOrder {
    private String orderId;
    private String vendorId;
    private Date orderDate;
    private List<PurchaseOrderItem> items;
    private double totalAmount;

    // Constructor
    public PurchaseOrder(String orderId, String vendorId, Date orderDate, List<PurchaseOrderItem> items) {
        this.orderId = orderId;
        this.vendorId = vendorId;
        this.orderDate = orderDate;
        this.items = items;
        this.totalAmount = calculateTotalAmount();
    }

    // Method to calculate total amount
    private double calculateTotalAmount() {
        double total = 0;
        for (PurchaseOrderItem item : items) {
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

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public List<PurchaseOrderItem> getItems() {
        return items;
    }

    public void setItems(List<PurchaseOrderItem> items) {
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

class PurchaseOrderItem {
    private String description;
    private int quantity;
    private double unitPrice;

    public PurchaseOrderItem(String description, int quantity, double unitPrice) {
        super();
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    // Getters and Setters
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