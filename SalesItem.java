package application;
public class SalesItem {
    // Attributes of the sales item
    private String itemId;
    private String description;
    private double price;
    private int quantityAvailable;

    // Constructor to initialize the sales item
    public SalesItem(String itemId, String description, double price, int quantityAvailable) {
        this.itemId = itemId;
        this.description = description;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
    }

    // Getters for each attribute
    public String getItemId() {
        return itemId;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    // Setters for each attribute
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    // Method to display item details
    public String toString() {
        return "SalesItem{" + "itemId='" + itemId + '\'' + ", description='" + description + '\'' + ", price=" + price
                + ", quantityAvailable=" + quantityAvailable + '}';
    }
    
    public static void main(String[] args) {
        SalesItem mySales = new SalesItem("0", "Eggs", 500.50, 900);

        // Accessing entity values
        System.out.println("Item ID: " + mySales.getItemId());
        System.out.println("Customer ID: " + mySales.getDescription());
        System.out.println("Cost: $" + mySales.getPrice());
        System.out.println("Department: " + mySales.getQuantityAvailable());
    } //end of method
    
}
