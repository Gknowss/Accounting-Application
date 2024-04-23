package application;
public class Invoice 
{
    // Entities
    private int invoiceNumber;
    private String customerId;
    private double cost;
    private String department;
    private String cashier;

    // Constructor
    public Invoice(int invoiceNumber, String customerId, double cost, String department, String cashier) {
        this.invoiceNumber = invoiceNumber;
        this.customerId = customerId;
        this.cost = cost;
        this.department = department;
        this.cashier = cashier;
    }

    // Getters and setters 
    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public double getCost() {
        return cost;
    }

    public String getDepartment() {
        return department;
    }

    public String getCashier() {
        return cashier;
    }
    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCashier(String cashier) {
        this.cashier = cashier;
    }

    // Other methods (we will decide later if we need any  )
    //

    //example but commented :
    
      // Example Usage
    public static void main(String[] args) {
        Invoice myInvoice = new Invoice(1234, "ABC123", 500.50, "Sales", "John Doe");

        // Accessing entity values
        System.out.println("Invoice Number: " + myInvoice.getInvoiceNumber());
        System.out.println("Customer ID: " + myInvoice.getCustomerId());
        System.out.println("Cost: $" + myInvoice.getCost());
        System.out.println("Department: " + myInvoice.getDepartment());
        System.out.println("Cashier: " + myInvoice.getCashier());
    }
     
     
}
