package collection_java.hashing_and_hash_codes.understanding_hashCodeQ;

import java.util.*;

import collection_java.filling_containers.using_abstract_classes.Countries;

/**
 * SlowMap
 */
public class SlowMap<K, V> extends AbstractMap<K, V> {
    private List<K> keys  = new ArrayList<>();
    private List<V> values  = new ArrayList<>();
    public V put(K key, V value){
        V oldValue = get(key);
        if(!keys.contains(key)){
            keys.add(key);
            values.add(value);
        }else {values.set(keys.indexOf(key), value);}
        return oldValue;
    }
    public V get(Object key){
        if(!keys.contains(key))
            return null;
        return values.get(keys.indexOf(key));
    }
    public Set<Map.Entry<K, V>> entrySet(){
        Set<Map.Entry<K, V>> set = new HashSet<>();
        Iterator<K> kI = keys.iterator();
        Iterator<V> vI = values.iterator();
        
        while (kI.hasNext() && vI.hasNext()) {
            set.add(new MapEntry<>(kI.next(), vI.next()));
        }
        return set;
    }

    public static void main(String[] args) {
        SlowMap<String, String> slowMap = new SlowMap<>();
        slowMap.putAll(Countries.FlyWeightMap.capitals(5));
        System.out.println(slowMap);
        System.out.println(slowMap.get("ALGERIA"));
        System.out.println(slowMap.entrySet());
    }
}

