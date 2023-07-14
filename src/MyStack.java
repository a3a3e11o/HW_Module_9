public class MyStack<T> extends MyLinkedList<T> {
    public void push(T value) {
        add(value);
    }

    public T peek() {
        return get(size() - 1);
    }

    public T pop() {
        DLNode<T> currentNode = getNode(size() - 1);
        remove(size() - 1);
        return currentNode.getValue();
    }
}