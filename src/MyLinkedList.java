public class MyLinkedList<T> {
    private DLNode<T> firstNode;
    private DLNode<T> lastNode;
    private int size = 0;

    public void add(T value) {
        if (firstNode == null) {
            firstNode = new DLNode<>(null, null, value);
        } else if (lastNode == null) {
            lastNode = new DLNode<>(firstNode, null, value);
            firstNode.setNextNode(lastNode);
        } else {
            DLNode<T> node = new DLNode<>(lastNode, null, value);
            lastNode.setNextNode(node);
            lastNode = node;
        }
        size++;
    }

    DLNode<T> getNode(int index) {
        DLNode<T> currentNode = firstNode;
        for(int i = 0; i < index; i++) {
            currentNode = currentNode.getNextNode();
        }
        return currentNode;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (index == 0) {
            firstNode = firstNode.getNextNode();
        } else {
            DLNode<T> before = getNode(index - 1);
            before.setNextNode(before.getNextNode().getNextNode());
        }
        size--;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        DLNode<T> currentNode = firstNode;
        for(int i = 0; i < index; i++) {
            currentNode = currentNode.getNextNode();
        }
        return currentNode.getValue();
    }

    public int size() {
        return size;
    }

    public void clear() {
        for (DLNode<T> x = firstNode; x != null; ) {
            DLNode<T> next = x.getNextNode();
            x.setValue(null);
            x.setNextNode(null);
            x.setPrevNode(null);
            x = next;
        }
        firstNode = lastNode = null;
        size = 0;
    }
}
