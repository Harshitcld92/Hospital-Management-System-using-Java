package hospitl_Management;



import java.util.Date;

public class Appointment {
    private String id;
    private String patientId;
    private String doctorId;
    private Date dateTime;
    private String reason;

    // Constructor
    public Appointment(String id, String patientId, String doctorId, Date dateTime, String reason) {
        this.id = id;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.dateTime = dateTime;
        this.reason = reason;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getPatientId() { return patientId; }
    public void setPatientId(String patientId) { this.patientId = patientId; }
    public String getDoctorId() { return doctorId; }
    public void setDoctorId(String doctorId) { this.doctorId = doctorId; }
    public Date getDateTime() { return dateTime; }
    public void setDateTime(Date dateTime) { this.dateTime = dateTime; }
    public String getReason() { return reason; }
    public void setReason(String reason) { this.reason = reason; }
}