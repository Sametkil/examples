package generics.multipletypegenericExample;

public class KeyValuePair<K,V>{
    private K key;
    private V value;

    public KeyValuePair(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void displayInfo(){
        System.out.println(" K -> "+ key.getClass().getName()
                + " V -> "+value.getClass().getName());
    }
}
