package inheritance;

import java.util.HashMap;
import java.util.Map;

class BusMenagment {
    private int total_bus_num;
    private String bus_name;

    public BusMenagment(String bus_name, int total_bus_num) {
        this.total_bus_num = total_bus_num;
        this.bus_name = bus_name;
    }

    public Map<String, Object> getBusMenagement() {
        Map<String, Object> var_bus_menagement = new HashMap<>();
        var_bus_menagement.put("total_bus_num", total_bus_num);
        var_bus_menagement.put("bus_name", bus_name);
        return var_bus_menagement;
    }

    public void setBusMenagement(Map<String, Object> set_var_bus_menagement) {
        if (set_var_bus_menagement.containsKey("bus_name")) {
            bus_name = (String) set_var_bus_menagement.get("bus_name");
        }

        if (set_var_bus_menagement.containsKey("total_bus_num")) {
            total_bus_num = (int) set_var_bus_menagement.get("total_bus_num");
        }
    }
}

class BusDetails extends BusMenagment {
    private String bus_id;
    private String color;

    public BusDetails(String bus_id, String color, String bus_name, int total_bus_num) {
        super(bus_name, total_bus_num);
        this.bus_id = bus_id;
        this.color = color;
    }

    public Map<String, Object> getBusDetails() {
        Map<String, Object> var_get_bus_details = super.getBusMenagement();
        var_get_bus_details.put("bus_id", bus_id);
        var_get_bus_details.put("color", color);
        return var_get_bus_details;
    }

    public void setBusDetails(Map<String, Object> var_set_bus_details) {
        if (var_set_bus_details.containsKey("bus_id")) {
            bus_id = (String) var_set_bus_details.get("bus_id");
        }

        if (var_set_bus_details.containsKey("color")) {
            color = (String) var_set_bus_details.get("color");
        }
    }

}

public class InheritanceExample5 {
    public static void main(String args[]) {
        BusMenagment OB1 = new BusMenagment("Hanif", 50);
        Map<String, Object> var_bus_menage = OB1.getBusMenagement();
        System.out.println(var_bus_menage);

        BusDetails OB2 = new BusDetails("B01", "Blue", "Hanif", 10);

        Map<String, Object> var_bus_details = OB2.getBusDetails();

        var_bus_details.put("bus_id", "B02");

        OB2.setBusDetails(var_bus_details);

        System.out.println("Bus id is: " + var_bus_details.get("bus_id"));
        System.out.println("Bus Color is: " + var_bus_details.get("color"));

    }
}
