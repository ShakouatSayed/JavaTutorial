package encapsulation_example.encapsulation_java;

import java.util.HashMap;
import java.util.Map;

class CarGame {
    private int num_of_car;
    private String side;
    private String color;

    public CarGame(int num_of_car, String side, String color) {
        this.num_of_car = num_of_car;
        this.side = side;
        this.color = color;
    }

    public Map<String, Object> getCarGame() {
        Map<String, Object> newMap = new HashMap<>();
        newMap.put("num_of_car", num_of_car);
        newMap.put("side", side);
        newMap.put("color", color);
        return newMap;
    }

    public void setCarGame(Map<String, Object> set_value) {
        if (set_value.containsKey("name_of_car")) {
            num_of_car = (int) set_value.get("num_of_car");
        }
        if (set_value.containsKey("side")) {
            side = (String) set_value.get("side");
        }
        if (set_value.containsKey("color")) {
            color = (String) set_value.get("color");
        }
    }
}

public class Example04 {
    public static void main(String args[]) {
        CarGame OB1 = new CarGame(2, "Left Sied", "Blue");
        Map<String, Object> _newMap = OB1.getCarGame();
        for (Map.Entry<String, Object> entry : _newMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
