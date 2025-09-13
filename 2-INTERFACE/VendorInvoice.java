public class VendorInvoice implements Payable {
    private String vendorName;
    private String invoiceNumber;
    private double amountDue; 

    // constructor
    public VendorInvoice(String vendorName, String invoiceNumber, double amountDue) {
        this.vendorName = vendorName;
        this.invoiceNumber = invoiceNumber;
        setAmountDue(amountDue);
    }

    // getter & setter
    public String getVendorName() { 
        return vendorName; 
    }

    public void setVendorName(String vendorName) { 
        this.vendorName = vendorName; 
    }

    public String getInvoiceNumber() { 
        return invoiceNumber; 
    }

    public void setInvoiceNumber(String invoiceNumber) { 
        this.invoiceNumber = invoiceNumber; 
    }

    public double getAmountDue() { 
        return amountDue; 
    }

    public void setAmountDue(double amountDue) {
        if (amountDue < 0) throw new IllegalArgumentException("Amount due must be positive.");
        this.amountDue = amountDue;
    }

    @Override
    public double calculatePayment() {
        return amountDue;
    }

    @Override
    public String getPayeeName() {
        return vendorName;
    }

    @Override
    public void print() {
        System.out.printf(
            "Vendor Invoice: %s | Invoice #: %s | Payment: $%.2f%n",
            vendorName, invoiceNumber, calculatePayment()
        );
    }
}
