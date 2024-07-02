package collection_java.understanding_maps;

public class AssoceativeArray<K, V> {
    private Object[][] pairs;
    private int index;
    public AssoceativeArray(int length){
        pairs = new Object[length][2];
    }

    public void put(K key, V value){
        if(index >= pairs.length)
            throw new ArrayIndexOutOfBoundsException();
        pairs[index++] = new Object[]{key, value};
    }

    @SuppressWarnings("unchecked")
    public V get(K key){
        for(int i = 0; i < index; i++)
            if(key.equals(pairs[i][0]))
                return (V) pairs[i][1];
        return null;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < index; i++){
            sb.append(pairs[i][0].toString());
            sb.append(": ");
            sb.append(pairs[i][1].toString());
            if(i < index - 1){
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        AssoceativeArray<String, String> map = new AssoceativeArray<>(7);
        map.put("Fisherman", "Caught the Fish");
        map.put("Softwear Engineers", "Create a New Software");
        map.put("Creketerman", "Play creket match.");
        map.put("Gress", "green");
        map.put("Sun", "warm");
        map.put("Cold", "9 degree Celcius.");
        try{
            map.put("Fly", "Bird is Fly");
        }
        catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println(map);
        System.out.println(map.get("Softwear Engineers"));
    }
}
