package hospitl_Management;




import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BillingManager {
    private Map<String, Invoice> invoiceDatabase = new HashMap<>();

    // Generate a new invoice
    public void generateInvoice(Invoice invoice) {
        invoiceDatabase.put(invoice.getInvoiceId(), invoice);
    }

    // Get a specific invoice by ID
    public Invoice getInvoice(String id) {
        return invoiceDatabase.get(id);
    }

    // Get all invoices for a specific patient
    public List<Invoice> getInvoicesForPatient(String patientId) {
        List<Invoice> invoices = new ArrayList<>();
        for (Invoice invoice : invoiceDatabase.values()) {
            if (invoice.getPatientId().equals(patientId)) {
                invoices.add(invoice);
            }
        }
        return invoices;
    }
}
