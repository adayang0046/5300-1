import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Payable> payables = new ArrayList<>();

        // 2 freelancers
        payables.add(new Freelancer("Ada", "Yang", 30.00, 45.0)); 
        payables.add(new Freelancer("Bob", "Liu", 25.00, 30.0));  

        // 2 vendorinvoice
        payables.add(new VendorInvoice("Rodlands Inc.", "01", 880.75));
        payables.add(new VendorInvoice("Shabang LLC", "02", 500.00));

        double totalPayout = 0.0;

        for (Payable p : payables) {
            p.print();
            totalPayout += p.calculatePayment();
        }

        System.out.printf("Total payout: $%.2f%n", totalPayout);
    }
}
