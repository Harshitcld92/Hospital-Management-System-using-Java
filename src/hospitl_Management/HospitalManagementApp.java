package hospitl_Management;



import java.util.Date;

public class HospitalManagementApp {

    public static void main(String[] args) {
        // Create managers
        PatientManager patientManager = new PatientManager();
        AppointmentManager appointmentManager = new AppointmentManager();
        HealthRecordManager healthRecordManager = new HealthRecordManager();
        BillingManager billingManager = new BillingManager();
        InventoryManager inventoryManager = new InventoryManager();
        StaffManager staffManager = new StaffManager();

        // Create and register a patient
        Patient patient = new Patient("P001", "John Doe", "1990-01-01", "123 Main St", "555-5555");
        patientManager.registerPatient(patient);
        System.out.println("Registered Patient: " + patient.getName());

        // Schedule an appointment
        Appointment appointment = new Appointment("A001", "P001", "D001", new Date(), "Routine Checkup");
        appointmentManager.scheduleAppointment(appointment);
        System.out.println("Scheduled Appointment: " + appointment.getReason());

        // Add a health record
        HealthRecord healthRecord = new HealthRecord("R001", "P001", new Date(), "All vitals are normal.");
        healthRecordManager.addRecord(healthRecord);
        System.out.println("Added Health Record: " + healthRecord.getDetails());

        // Generate an invoice
        Invoice invoice = new Invoice("I001", "P001", 150.00, new Date());
        billingManager.generateInvoice(invoice);
        System.out.println("Generated Invoice Amount: $" + invoice.getAmount());

        // Add a medical supply
        MedicalSupply supply = new MedicalSupply("S001", "Bandages", 100, 5.00);
        inventoryManager.addSupply(supply);
        System.out.println("Added Medical Supply: " + supply.getName());

        // Add staff
        Staff staff = new Staff("ST001", "Dr. Smith", "Doctor", "General Medicine");
        staffManager.addStaff(staff);
        System.out.println("Added Staff: " + staff.getName());

        // Print some details to verify
        System.out.println("\nPatient Details:");
        System.out.println(patientManager.getPatient("P001").getName());

        System.out.println("\nAppointments for Patient P001:");
        appointmentManager.getAppointmentsForPatient("P001").forEach(app ->
            System.out.println("Appointment ID: " + app.getId() + ", Reason: " + app.getReason())
        );

        System.out.println("\nHealth Records for Patient P001:");
        healthRecordManager.getRecordsForPatient("P001").forEach(record ->
            System.out.println("Record ID: " + record.getRecordId() + ", Details: " + record.getDetails())
        );

        System.out.println("\nInvoices for Patient P001:");
        billingManager.getInvoicesForPatient("P001").forEach(inv ->
            System.out.println("Invoice ID: " + inv.getInvoiceId() + ", Amount: $" + inv.getAmount())
        );

        System.out.println("\nMedical Supplies:");
        inventoryManager.listSupplies().forEach(sup ->
            System.out.println("Supply ID: " + sup.getId() + ", Name: " + sup.getName())
        );

        System.out.println("\nStaff List:");
        staffManager.listStaff().forEach(stf ->
            System.out.println("Staff ID: " + stf.getId() + ", Name: " + stf.getName())
        );
    }
}

