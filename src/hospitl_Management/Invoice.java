package hospitl_Management;



import java.util.Date;

public class Invoice {
    private String invoiceId;
    private String patientId;
    private double amount;
    private Date date;

    // Constructor
    public Invoice(String invoiceId, String patientId, double amount, Date date) {
        this.invoiceId = invoiceId;
        this.patientId = patientId;
        this.amount = amount;
        this.date = date;
    }

    // Getters and Setters
    public String getInvoiceId() { return invoiceId; }
    public void setInvoiceId(String invoiceId) { this.invoiceId = invoiceId; }
    public String getPatientId() { return patientId; }
    public void setPatientId(String patientId) { this.patientId = patientId; }
    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }
}

