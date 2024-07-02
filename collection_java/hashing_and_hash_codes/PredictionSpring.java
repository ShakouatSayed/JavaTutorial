package collection_java.hashing_and_hash_codes;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class PredictionSpring {

    public static <T extends GroundHog> void detectSpring(Class<T> type) throws Exception {
        Constructor<T> groundHog = type.getConstructor(int.class);
        Map<GroundHog, Prediction> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(groundHog.newInstance(i), new Prediction());
        }
        System.out.println(map);
        GroundHog gh = groundHog.newInstance(3);
        System.out.println("Found all prediction: " + gh);
        if (map.containsKey(gh)) {
            System.out.println("map.get(gh) : " + map.get(gh));
        } else {
            System.out.println("File not found : " + gh);
        }
    }

    public static void main(String[] args) throws Exception {
        detectSpring(GroundHog.class);
    }
}
