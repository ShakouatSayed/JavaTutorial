package collection_java.filling_containers.map_generators;

import java.util.LinkedHashMap;

import generics.generic_interfaces.coffee.Generator;

public class MapData<K, V> extends LinkedHashMap<K, V> {
    
    //a single pair generator
    public MapData(Generator<Pair<K, V>> gen, int quantity){
        for(int i = 0; i < quantity; i++){
            Pair<K, V> p = gen.next();
            put(p.key, p.value);
        }
    } 

    // two pair seperator
    public MapData(Generator<K> genK , Generator<V> genV, int quantity){
        for(int i = 0; i < quantity; i++){
            put(genK.next(), genV.next());
        }
    }

    //a generator and a single value
    public MapData(Generator<K> genK, V value, int quantity){
        for(int i = 0; i < quantity; i++){
            put(genK.next(), value);
        }
    }

    // a itarable and a generator value
    public MapData(Iterable<K> genK, Generator<V> genV){
        for(K key: genK){
            put(key, genV.next());
        }
    }

    // a itarable and a single value
    public MapData(Iterable<K> genK, V value ){
        for(K key: genK)
            put(key, value);
    }

    //use a covarient method
    public static <K, V> MapData<K, V> map(Generator<Pair<K, V>> gen, int quantity){
        return new MapData<>(gen, quantity);
    }

    public static <K, V> MapData<K, V> map(Generator<K> genK, Generator<V> genV, int quantity){
        return new MapData<>(genK, genV, quantity);
    }

    public static <K, V> MapData<K, V> map(Generator<K> genK, V value, int quantity){
        return new MapData<K,V>(genK, value, quantity);
    }

    public static <K, V> MapData<K, V> map(Iterable<K> genK, Generator<V> genV){
        return new MapData<>(genK, genV);
    }

    public static <K, V> MapData<K, V> map(Iterable<K> genK, V value){
        return new MapData<>(genK, value);
    }
}
