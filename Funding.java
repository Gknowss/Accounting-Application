package application;

public class Funding {
    private String vendorId;
    private double availableFunds;
    private double usedFunds;

    // Constructor
    public Funding(String vendorId, double availableFunds, double useFunds) {
        this.vendorId = vendorId;
        this.availableFunds = availableFunds;
        this.usedFunds = useFunds;
    }

    // Getters and Setters
    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public double getAvailableFunds() {
        return availableFunds;
    }

    public void setAvailableFunds(double availableFunds) {
        this.availableFunds = availableFunds;
    }

    public double getUsedFunds() {
        return usedFunds;
    }

    public void setUsedFunds(double usedFunds) {
        this.usedFunds = usedFunds;
    }

    // Method to add funds
    public void addFunds(double amount) {
        this.availableFunds += amount;
    }

    // Method to use funds
    public void useFunds(double amount) {
        if (amount <= availableFunds) {
            this.availableFunds -= amount;
            this.usedFunds += amount;
        } else {
            System.out.println("Error");
    }
    }

}
