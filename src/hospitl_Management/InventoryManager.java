package hospitl_Management;




import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InventoryManager {
    private Map<String, MedicalSupply> inventory = new HashMap<>();

    // Add a new medical supply
    public void addSupply(MedicalSupply supply) {
        inventory.put(supply.getId(), supply);
    }

    // Get a specific supply by ID
    public MedicalSupply getSupply(String id) {
        return inventory.get(id);
    }

    // Update a supply's details
    public void updateSupply(MedicalSupply supply) {
        inventory.put(supply.getId(), supply);
    }

    // List all supplies
    public List<MedicalSupply> listSupplies() {
        return new ArrayList<>(inventory.values());
    }
}


