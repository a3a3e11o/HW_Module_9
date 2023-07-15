public class MyArrayList<T> {
    private final int INIT_SIZE = 16;
    private Object[] array = new Object[INIT_SIZE];
    private int size = 0;

    public void add(T value) {
        if (size == array.length - 1)
            resize(array.length * 2);
        array[size++] = value;
    }

    private void indexCheck(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }
    }

    public T get(int index) {
        indexCheck(index);
        return (T) array[index];
    }

    public void remove(int index) {
        indexCheck(index);
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
            array[size] = null;
        }
        size--;
    }

    public int size() {
        return size;
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
