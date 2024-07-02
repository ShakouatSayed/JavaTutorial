/* Exercise 17: (2) Implement the rest of the Map interface for SlowMap.  */

package collection_java.hashing_and_hash_codes.understanding_hashCodeQ;  
import java.util.*;
import collection_java.filling_containers.using_abstract_classes.Countries;
/**
 * Exercise17
 */
public class Exercise17<K, V> implements Map<K, V>{

    private List<K> keys = new ArrayList<>();
    private List<V> values = new ArrayList<>();
    //private EntrySet entries = new EntrySet<>();
    private EntrySet entries = new EntrySet();
    //private Set<Map.Entry<K, V>> entries2 =new HashSet<>();
    private Set<K> keySets = new HashSet<>();  

    public Set<Map.Entry<K, V>> entrySet(){
        return entries;
    }
    public Set<K> keySet(){
        return keySets;
    }

    public V put(K key, V value){
        V oldValues = get(keys);
        if(!(keys.contains(key))){
            keys.add(key);
            values.add(value);
        }else {
            values.set(keys.indexOf(key), value);
        }
        return oldValues;
    }
    public V get(Object key){
        if(!(keys.contains(key)))
            return null;
        return values.get(keys.indexOf(key));
    }

    public void clear(){
        keys.clear();
        values.clear();
    }
    public boolean containsKey(Object key){
        if(!(keys.contains(key)))
            return false;
        return true;
    }
    public boolean containsValue(Object value){
        if((values.contains(value)))
            return false;
        return true;
    }

    public int hashCode(){
        return this.entrySet().hashCode();
    }
    
    public boolean equals(Object map){
        if(!(map instanceof SlowMap))
            return false;
        if(this.entrySet().equals(map))
            return true;
        else return false;
    }
    public boolean isEmpty(){
        return this.entrySet().isEmpty();
    }

    public class EntrySet extends AbstractSet<Map.Entry<K, V>>{
        public int size(){
            return keys.size();
        }
        public Iterator<Map.Entry<K, V>> iterator() {
            return new Iterator<>() {
                private int index = -1;
                public boolean hasNext(){
                    return index<keys.size() - 1;
                }
                @SuppressWarnings({ "rawtypes", "unchecked" })
                public Map.Entry<K, V> next(){
                    int intIndex = ++index;
                    return new MapEntry(keys.get(intIndex), values.get(intIndex));
                }
                public void remove(){
                    keys.remove(index);
                    values.remove(index--);
                }
            };
        }
    }

    public void putAll(Map<? extends K, ? extends V> map){
        for(Entry<? extends K, ? extends V> entry : map.entrySet())
            this.put(entry.getKey(), entry.getValue());
    }

    public V remove(Object key){
        V result = this.get(keys);
        int index = keys.indexOf(key);
        keys.remove(index);
        values.remove(index);
        return result;
    }

    public int size(){
        return this.keys.size();
    }

    public Collection<V> values(){
        return values;
    }

    public String toString(){return this.entrySet().toString();}

    public class KeySet extends AbstractSet<K> {
        public int size(){return keys.size();}
        public Iterator<K> iterator(){
            return new Iterator<>() {
                private int index = -1;
                public boolean hasNext(){
                    return index < keys.size() - 1;
                }
                public K next(){
                    int intIndex = ++index;
                    return (K)keys.get(intIndex);
                }
                public void remove(){
                    keys.remove(index--);
                }
            };
        }
    }

    public static void main(String[] args) {
        Exercise17<String, String> map = new Exercise17<>();
        map.putAll(Countries.FlyWeightMap.capitals(5));
        System.out.println("map.putAll(Countries.FlyWeightMap.capitals(10)) ");
        System.out.println("Countries.FlyWeightMap.capitals(5) : "+map);
        System.out.println("map.get(\"ALGERIA\") : "+map.get("ALGERIA"));
        System.out.println("map.entrySet() : "+map.entrySet());
        System.out.println("Countries.FlyWeightMap.capitals(10) : "+map);
        map.putAll(Countries.FlyWeightMap.capitals(5));
        System.out.println("map : "+map);
        System.out.println("map.clear() ");
        map.clear();
        System.out.println("Countries.FlyWeightMap.capitals(5) : "+map);
        System.out.println("map.isEmpty() : " + map.isEmpty());
        Exercise17<String, String> map1 = new Exercise17<>(); 
        map1.putAll(Countries.FlyWeightMap.capitals(5));     
        map = map1;      
        System.out.println("map.equals(map1) : "+map.equals(map1));
        System.out.println("map1.containsKey(\"BANGLADESH\") : "+map.containsKey("BANGLADESH"));
        System.out.println("map1.containsValue(\"BANGLADESH\") : "+map.containsValue("BANGLADESH"));
        System.out.println("map1.size() : "+map.size());
        System.out.println("map.hashCode() : "+map.hashCode());
        System.out.println("map.values(): " + map.values());
    }
    
}