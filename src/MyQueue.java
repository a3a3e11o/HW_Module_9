public class MyQueue<T> extends MyLinkedList<T> {
    public T peek() {
        return get(0);
    }

    public T pool() {
        DLNode<T> currentNode = getNode(0);
        remove(0);
        return currentNode.getValue();
    }
}
