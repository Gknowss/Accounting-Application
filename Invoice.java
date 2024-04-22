package application;

import java.util.Date;
import java.util.List;

public class Invoice {
    private String invoiceId;
    private String customerId;
    private Date invoiceDate;
    private List<InvoiceItem> items;
    private double totalAmount;

    // Constructor
    public Invoice(String invoiceId, String customerId, Date invoiceDate, List<InvoiceItem> items) {
        this.invoiceId = invoiceId;
        this.customerId = customerId;
        this.invoiceDate = invoiceDate;
        this.items = items;
        this.totalAmount = calculateTotalAmount();
    }

    // Method to calculate total amount
    private double calculateTotalAmount() {
        double total = 0;
        for (InvoiceItem item : items) {
            total += item.getQuantity() * item.getUnitPrice();
        }
        return total;
    }

    // Getters and Setters
    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public List<InvoiceItem> getItems() {
        return items;
    }

    public void setItems(List<InvoiceItem> items) {
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

class InvoiceItem {
    private String description;
    private int quantity;
    private double unitPrice;

    public InvoiceItem(String description, int quantity, double unitPrice) {
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
