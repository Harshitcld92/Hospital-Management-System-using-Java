package hospitl_Management;




import java.util.HashMap;
import java.util.Map;

public class PatientManager {
    private Map<String, Patient> patientDatabase = new HashMap<>();

    // Register a new patient
    public void registerPatient(Patient patient) {
        patientDatabase.put(patient.getId(), patient);
    }

    // Get a patient by ID
    public Patient getPatient(String id) {
        return patientDatabase.get(id);
    }

    // Update patient information
    public void updatePatient(Patient patient) {
        patientDatabase.put(patient.getId(), patient);
    }
}



