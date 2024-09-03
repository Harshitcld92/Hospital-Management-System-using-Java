package hospitl_Management;





import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HealthRecordManager {
    private Map<String, HealthRecord> recordDatabase = new HashMap<>();

    // Add a health record
    public void addRecord(HealthRecord record) {
        recordDatabase.put(record.getRecordId(), record);
    }

    // Get a specific health record
    public HealthRecord getRecord(String id) {
        return recordDatabase.get(id);
    }

    // Get all records for a specific patient
    public List<HealthRecord> getRecordsForPatient(String patientId) {
        List<HealthRecord> records = new ArrayList<>();
        for (HealthRecord record : recordDatabase.values()) {
            if (record.getPatientId().equals(patientId)) {
                records.add(record);
            }
        }
        return records;
    }
}


