public class SLNode<K, V> {

    private K key;
    private V value;
    private SLNode<K, V> next;

    public SLNode(K key, V value, SLNode<K, V> next){
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public SLNode<K, V> getNext() {
        return next;
    }

    public void setNext(SLNode<K, V> next) {
        this.next = next;
    }
}
