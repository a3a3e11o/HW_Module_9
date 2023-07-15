public class MyHashMap<K, V> {
    private final int INIT_SIZE = 16;
    private Object[] array = new Object[INIT_SIZE];
    private int size = 0;

    public void put(K key, V value){
        if (size == array.length - 1)
            resize(array.length * 2);
        int index = index(key);
        SLNode<K, V> newEntry = new SLNode<>(key, value, null);
        if(array[index] == null){
            array[index] = newEntry;
        }else {
            SLNode<K, V> previousNode = null;
            SLNode<K, V> currentNode = (SLNode<K, V>) array[index];
            while(currentNode != null){
                if(currentNode.getKey().equals(key)){
                    currentNode.setValue(value);
                    break;
                }
                previousNode = currentNode;
                currentNode = currentNode.getNext();
            }
            if(previousNode != null)
                previousNode.setNext(newEntry);
        }
        size++;
    }

    public V get(K key){
        V value = null;
        int index = index(key);
        SLNode<K, V> entry = (SLNode<K, V>) array[index];
        while (entry != null){
            if(entry.getKey().equals(key)) {
                value = entry.getValue();
                break;
            }
            entry = entry.getNext();
        }
        return value;
    }

    public void remove(K key){
        int index = index(key);
        SLNode<K, V> previous = null;
        SLNode<K, V> entry = (SLNode<K, V>) array[index];
        while (entry != null){
            if(entry.getKey().equals(key)){
                if(previous == null){
                    entry = entry.getNext();
                    array[index] = entry;
                    size--;
                    return;
                }else {
                    previous.setNext(entry.getNext());
                    size--;
                    return;
                }
            }
            previous = entry;
            entry = entry.getNext();
        }
    }

    public int size() {
        return size;
    }

    private int index(K key){
        if(key == null){
            return 0;
        }
        return Math.abs(key.hashCode() % INIT_SIZE);
    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    public void clear() {
        array = new Object[INIT_SIZE];
        size = 0;
    }
}
