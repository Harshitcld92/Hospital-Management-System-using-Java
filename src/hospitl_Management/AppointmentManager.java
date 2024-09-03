package hospitl_Management;




import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppointmentManager {
    private Map<String, Appointment> appointmentDatabase = new HashMap<>();

    // Schedule a new appointment
    public void scheduleAppointment(Appointment appointment) {
        appointmentDatabase.put(appointment.getId(), appointment);
    }

    // Get an appointment by ID
    public Appointment getAppointment(String id) {
        return appointmentDatabase.get(id);
    }

    // Get all appointments for a specific patient
    public List<Appointment> getAppointmentsForPatient(String patientId) {
        List<Appointment> appointments = new ArrayList<>();
        for (Appointment appointment : appointmentDatabase.values()) {
            if (appointment.getPatientId().equals(patientId)) {
                appointments.add(appointment);
            }
        }
        return appointments;
    }
}


