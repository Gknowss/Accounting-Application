package application;

import java.util.Date;
import java.util.List;

public class Estimate {
    private String estimateId;
    private String customerId;
    private Date estimateDate;
    private List<EstimateItem> items;
    private double totalAmount;

    // Constructor
    public Estimate(String estimateId, String customerId, Date estimateDate, List<EstimateItem> items) {
        this.estimateId = estimateId;
        this.customerId = customerId;
        this.estimateDate = estimateDate;
        this.items = items;
        this.totalAmount = calculateTotalAmount();
    }

    // Method to calculate total amount
    private double calculateTotalAmount() {
        double total = 0;
        for (EstimateItem item : items) {
            total += item.getQuantity() * item.getUnitPrice();
        }
        return total;
    }

    // Getters and Setters
    public String getEstimateId() {
        return estimateId;
    }

    public void setEstimateId(String estimateId) {
        this.estimateId = estimateId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Date getEstimateDate() {
        return estimateDate;
    }

    public void setEstimateDate(Date estimateDate) {
        this.estimateDate = estimateDate;
    }

    public List<EstimateItem> getItems() {
        return items;
    }

    public void setItems(List<EstimateItem> items) {
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

class EstimateItem {
    private String description;
    private int quantity;
    private double unitPrice;

    public EstimateItem(String description, int quantity, double unitPrice) {
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
    // end Getters, and Setters

}
