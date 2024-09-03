package hospitl_Management;



import java.util.Date;

public class HealthRecord {
    private String recordId;
    private String patientId;
    private Date date;
    private String details;

    // Constructor
    public HealthRecord(String recordId, String patientId, Date date, String details) {
        this.recordId = recordId;
        this.patientId = patientId;
        this.date = date;
        this.details = details;
    }

    // Getters and Setters
    public String getRecordId() { return recordId; }
    public void setRecordId(String recordId) { this.recordId = recordId; }
    public String getPatientId() { return patientId; }
    public void setPatientId(String patientId) { this.patientId = patientId; }
    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }
    public String getDetails() { return details; }
    public void setDetails(String details) { this.details = details; }
}

