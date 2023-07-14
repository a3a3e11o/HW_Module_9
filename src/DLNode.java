public class DLNode<T> {
    private DLNode<T> prevNode;
    private DLNode<T> nextNode;
    private T value;

    public DLNode(DLNode<T> prevNode, DLNode<T> nextNode, T value) {
        this.prevNode = prevNode;
        this.nextNode = nextNode;
        this.value = value;
    }

    public DLNode<T> getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(DLNode<T> prevNode) {
        this.prevNode = prevNode;
    }

    public DLNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(DLNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
