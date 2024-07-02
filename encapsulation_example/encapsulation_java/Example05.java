package encapsulation_example.encapsulation_java;

import java.util.HashMap;
import java.util.Map;

class EducationSis {
    private int roll_num, reg_num;
    private String name, address;
    private double grade;

    public EducationSis(int roll_num, int reg_num, String name, String address, double grade) {
        this.roll_num = roll_num;
        this.reg_num = reg_num;
        this.name = name;
        this.address = address;
        this.grade = grade;
    }

    public Map<String, Object> getEducationSis() {
        Map<String, Object> _map_education_sis = new HashMap<>();
        _map_education_sis.put("roll_num", roll_num);
        _map_education_sis.put("reg_num", reg_num);
        _map_education_sis.put("name", name);
        _map_education_sis.put("address", address);
        _map_education_sis.put("grade", grade);
        return _map_education_sis;
    }

    public void setEducationSis(Map<String, Object> _set_education_sis) {
        if (_set_education_sis.containsKey("roll_num")) {
            roll_num = (int) _set_education_sis.get("roll_num");
        }
        if (_set_education_sis.containsKey("reg_num")) {
            reg_num = (int) _set_education_sis.get("reg_num");
        }
        if (_set_education_sis.containsKey("name")) {
            name = (String) _set_education_sis.get("name");
        }
        if (_set_education_sis.containsKey("address")) {
            address = (String) _set_education_sis.get("address");
        }
        if (_set_education_sis.containsKey("grade")) {
            grade = (float) _set_education_sis.get("grade");
        }
    }
}

public class Example05 {
    public static void main(String args[]) {
        EducationSis OB1 = new EducationSis(21, 175252651, "Shakouat", "Cox's Bazar", 2.97);
        Map<String, Object> _new_vlaue_map = OB1.getEducationSis();
        for (Map.Entry<String, Object> entry : _new_vlaue_map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
