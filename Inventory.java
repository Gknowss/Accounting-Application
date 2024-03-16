public class Inventory {
    private String inventoryId;
    private String itemName;
    private String partNumber;
    private String vendorId;
    private double unitPrice;
    private int quantity;

    // Constructor
    public Inventory(String inventoryId, String itemName, String partNumber, String vendorId, double unitPrice, int quantity) {
        this.inventoryId = inventoryId;
        this.itemName = itemName;
        this.partNumber = partNumber;
        this.vendorId = vendorId;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    // Getters and Setters
    public String getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(String inventoryId) {
        this.inventoryId = inventoryId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    // end Getters and Setters

    // Method to update quantity
    public void updateQuantity(int quantity) {
        this.quantity += quantity;
    }

}
