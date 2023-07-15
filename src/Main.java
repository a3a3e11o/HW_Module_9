public class Main {
    public static void main(String[] args) {
        //MyArrayList
        MyArrayList<String> array = new MyArrayList<>();
        for (int i = 0; i < 1000000; i++) {
        array.add("A" + i);
        }

        System.out.println("==========MyArrayList==========");
        System.out.println(array.get(0));
        System.out.println(array.get(1));
        System.out.println(array.get(2));
        System.out.println(array.get(3));
        System.out.println("Size is " + array.size());
        System.out.println("==========");

        array.remove(2);

        System.out.println(array.get(0));
        System.out.println(array.get(1));
        System.out.println(array.get(2));
        System.out.println(array.get(3));
        System.out.println("Size is " + array.size());
        System.out.println("==========");

        array.clear();

        System.out.println("Size is " + array.size());

        //MyLinkedList
        MyLinkedList<String> link = new MyLinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            link.add("L" + i);
        }

        System.out.println("==========MyLinkedList==========");
        System.out.println(link.get(0));
        System.out.println(link.get(1));
        System.out.println(link.get(2));
        System.out.println(link.get(3));
        System.out.println("Size is " + link.size());
        System.out.println("==========");

        link.remove(2);

        System.out.println(link.get(0));
        System.out.println(link.get(1));
        System.out.println(link.get(2));
        System.out.println(link.get(3));
        System.out.println("Size is " + link.size());
        System.out.println("==========");

        link.clear();

        System.out.println("Size is " + link.size());

        //MyQueue
        MyQueue<String> queue = new MyQueue<>();
        for (int i = 0; i < 1000000; i++) {
            queue.add("Q" + i);
        }

        System.out.println("==========MyQueue==========");
        System.out.println(queue.get(0));
        System.out.println(queue.get(1));
        System.out.println(queue.get(2));
        System.out.println(queue.get(3));
        System.out.println("Size is " + queue.size());
        System.out.println("==========");

        System.out.println(queue.peek());
        System.out.println("Size is " + queue.size());
        System.out.println("==========");

        System.out.println(queue.pool());
        System.out.println("Size is " + queue.size());
        System.out.println("==========");

        System.out.println(queue.get(0));
        System.out.println(queue.get(1));
        System.out.println(queue.get(2));
        System.out.println(queue.get(3));
        System.out.println("Size is " + queue.size());
        System.out.println("==========");

        queue.clear();

        System.out.println("Size is " + queue.size());

        //MyStack
        MyStack<String> stack = new MyStack<>();
        for (int i = 0; i < 1000000; i++) {
            stack.add("S" + i);
        }

        System.out.println("==========MyStack==========");
        System.out.println(stack.get(0));
        System.out.println(stack.get(1));
        System.out.println(stack.get(2));
        System.out.println(stack.get(3));
        System.out.println("Size is " + stack.size());
        System.out.println("==========");

        System.out.println(stack.peek());
        System.out.println("Size is " + stack.size());
        System.out.println("==========");

        System.out.println(stack.pop());
        System.out.println("Size is " + stack.size());
        System.out.println("==========");

        System.out.println(stack.get(999995));
        System.out.println(stack.get(999996));
        System.out.println(stack.get(999997));
        System.out.println(stack.get(999998));
        System.out.println("Size is " + stack.size());
        System.out.println("==========");

        stack.clear();

        System.out.println("Size is " + stack.size());

        //MyHashMap
        MyHashMap<Integer, String> map = new MyHashMap<>();
        for (int i = 0; i < 100000; i++) {
            map.put(i, "H" + i);
        }

        System.out.println("==========MyHashMap==========");
        System.out.println(map.get(0));
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));
        System.out.println("Size is " + map.size());
        System.out.println("==========");

        map.remove(2);

        System.out.println(map.get(0));
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));
        System.out.println("Size is " + map.size());
        System.out.println("==========");

        map.clear();

        System.out.println("Size is " + map.size());
    }
}