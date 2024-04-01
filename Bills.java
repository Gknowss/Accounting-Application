import java.util.Date;
import java.util.List;

public class Bills {
    private String billId;
    private String vendorId;
    private Date billDate;
    private List<BillItem> items;
    private double totalAmount;
    private boolean paid;

    // Constructor
    public Bills(String billId, String vendorId, Date billDate, boolean paid, List<BillItem> items) {
        this.billId = billId;
        this.vendorId = vendorId;
        this.billDate = billDate;
        this.items = items;
        this.paid = paid;
        this.totalAmount = calculateTotalAmount();
    }

    // Method to calculate total amount
    private double calculateTotalAmount() {
        double total = 0;
        for (BillItem item : items) {
            total += item.getQuantity() * item.getUnitPrice();
        }
        return total;
    }

    // Getters and Setters
    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public List<BillItem> getItems() {
        return items;
    }

    public void setItems(List<BillItem> items) {
        this.items = items;
    }
    
    public boolean getStatus() {
        return paid;
    }

    public void setStatus(boolean status) {
        this.paid = status;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    // end Getters and Setters

}

class BillItem {
    private String description;
    private int quantity;
    private double unitPrice;

    public BillItem(String description, int quantity, double unitPrice) {
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