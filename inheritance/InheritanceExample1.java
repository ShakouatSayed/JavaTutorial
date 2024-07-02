package inheritance;

import java.util.HashMap;
import java.util.Map;

class HotelMenag {
    private String name;
    private String post;
    private int worker;
    private int recipeItem;

    public HotelMenag(String name, String post, int woker, int recipeItem) {
        this.name = name;
        this.post = post;
        this.worker = woker;
        this.recipeItem = recipeItem;
    }

    public Map<String, Object> getHotelMenag() {
        Map<String, Object> hotelMenag = new HashMap<>();
        hotelMenag.put("name", name);
        hotelMenag.put("post", post);
        hotelMenag.put("worker", worker);
        hotelMenag.put("recipeItem", recipeItem);
        return hotelMenag;
    }

    public void setHotelMenag(Map<String, Object> set_value) {
        if (set_value.containsKey("name")) {
            name = (String) set_value.get("name");
        }
        if (set_value.containsKey("post")) {
            post = (String) set_value.get("post");
        }
        if (set_value.containsKey("worker")) {
            worker = (int) set_value.get("worker");
        }
        if (set_value.containsKey("recipeItem")) {
            recipeItem = (int) set_value.get("recipeItem");
        }
    }

}

class WorkerDetails extends HotelMenag {
    private int id;
    private String productTerget;

    public WorkerDetails(int id, String productTerget, String name, String post, int woker, int recipeItem) {
        super(name, post, woker, recipeItem);
        this.id = id;
        this.productTerget = productTerget;
    }

    public Map<String, Object> getWorkerDetails() {
        Map<String, Object> valueWorkerDetails = super.getHotelMenag();
        valueWorkerDetails.put("productTerget", productTerget);
        valueWorkerDetails.put("id", id);
        return valueWorkerDetails;
    }

}

public class InheritanceExample1 {
    public static void main(String args[]) {
        HotelMenag OB1 = new HotelMenag("Sayed", "Menegar", 20, 12);
        Map<String, Object> hotelObjec = OB1.getHotelMenag();
        for (Map.Entry<String, Object> entry : hotelObjec.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
