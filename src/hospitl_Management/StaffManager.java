package hospitl_Management;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StaffManager {
    private Map<String, Staff> staffDatabase = new HashMap<>();

    // Add a staff member
    public void addStaff(Staff staff) {
        staffDatabase.put(staff.getId(), staff);
    }

    // Get a specific staff member
    public Staff getStaff(String id) {
        return staffDatabase.get(id);
    }

    // Update a staff member's details
    public void updateStaff(Staff staff) {
        staffDatabase.put(staff.getId(), staff);
    }

    // List all staff members
    public List<Staff> listStaff() {
        return new ArrayList<>(staffDatabase.values());
    }
}

