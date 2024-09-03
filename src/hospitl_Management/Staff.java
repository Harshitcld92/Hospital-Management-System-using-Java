package hospitl_Management;


public class Staff {
    private String id;
    private String name;
    private String role;
    private String department;

    // Constructor
    public Staff(String id, String name, String role, String department) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.department = department;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
}

