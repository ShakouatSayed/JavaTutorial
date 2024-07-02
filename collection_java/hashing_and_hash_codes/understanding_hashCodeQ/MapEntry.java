package collection_java.hashing_and_hash_codes.understanding_hashCodeQ;

import java.util.*;

/**
 * MapEntry
 */
public class MapEntry <K, V> implements Map.Entry<K, V>{

    private K key;
    private V value;
    public MapEntry(K k, V v){
        key = k;
        value = v;
    }
    public K getKey(){return key;}
    public V getValue(){return value;}
    public V setValue(V v){
        V result = value; 
        value = v; 
        return result;
    }

    public boolean equals(Object key){
        if(this==key) return true;
        if(!(key instanceof Map.Entry))return false;

        Map.Entry<?, ?> entry = (Map.Entry<?, ?>)key;
        return key.equals(entry.getKey()) && value.equals(entry.getValue());
    }

    public int hasCode(){
        return key.hashCode() ^ value.hashCode();
    }

    public String toString(){
        return key +"="+value;
    }

}