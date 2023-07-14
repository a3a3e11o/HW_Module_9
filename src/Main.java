public class Main {
    public static void main(String[] args) {
        //MyArrayList
        MyArrayList<String> array = new MyArrayList<>();
        array.add("A");
        array.add("B");
        array.add("C");
        array.add("D");

        System.out.println("==========MyArrayList==========");
        System.out.println(array.get(0));
        System.out.println(array.get(1));
        System.out.println(array.get(2));
        System.out.println(array.get(3));
        System.out.println(array.size());
        System.out.println("==========");

        array.remove(2);

        System.out.println(array.get(0));
        System.out.println(array.get(1));
        System.out.println(array.get(2));
        System.out.println(array.size());
        System.out.println("==========");

        array.clear();

        System.out.println(array.get(0));
        System.out.println(array.get(1));
        System.out.println(array.get(2));

        //MyLinkedList
        MyLinkedList<String> link = new MyLinkedList<>();
        link.add("AA");
        link.add("BB");
        link.add("CC");
        link.add("DD");

        System.out.println("==========MyLinkedList==========");
        System.out.println(link.get(0));
        System.out.println(link.get(1));
        System.out.println(link.get(2));
        System.out.println(link.get(3));
        System.out.println(link.size());
        System.out.println("==========");

        link.remove(1);

        System.out.println(link.get(0));
        System.out.println(link.get(1));
        System.out.println(link.get(2));
        System.out.println(link.size());
        System.out.println("==========");

        link.clear();

        System.out.println(link.size());

        //MyQueue
        MyQueue<String> queue = new MyQueue<>();
        queue.add("AAA");
        queue.add("BBB");
        queue.add("CCC");
        queue.add("DDD");

        System.out.println("==========MyQueue==========");
        System.out.println(queue.get(0));
        System.out.println(queue.get(1));
        System.out.println(queue.get(2));
        System.out.println(queue.get(3));
        System.out.println(queue.size());
        System.out.println("==========");

        System.out.println(queue.peek());
        System.out.println("==========");

        System.out.println(queue.pool());
        System.out.println("==========");

        System.out.println(queue.get(0));
        System.out.println(queue.get(1));
        System.out.println(queue.get(2));

        //MyStack
        MyStack<String> stack = new MyStack<>();
        stack.push("AAAA");
        stack.push("BBBB");
        stack.push("CCCC");
        stack.push("DDDD");

        System.out.println("==========MyStack==========");
        System.out.println(stack.get(0));
        System.out.println(stack.get(1));
        System.out.println(stack.get(2));
        System.out.println(stack.get(3));
        System.out.println(stack.size());
        System.out.println("==========");

        System.out.println(stack.peek());
        System.out.println("==========");

        System.out.println(stack.pop());
        System.out.println("==========");

        System.out.println(stack.get(0));
        System.out.println(stack.get(1));
        System.out.println(stack.get(2));

        //MyHashMap
        System.out.println("==========MyHashMap==========");
        MyHashMap<Integer, String> map = new MyHashMap<>();
        System.out.println("Going to add entries in map");
        map.put(0, "Nothing");
        map.put(1, "ETC");
        map.put(2, "John");
        System.out.println("Displaying all the entry in map");
        System.out.println(map.get(0));
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println("Size is " + map.size());
        System.out.println("Removing the entry with key 2");
        map.remove(2);
        map.display();
        System.out.println("Size is " + map.size());
        System.out.println("Adding duplicate key 1 in map");
        map.put(1, "CSE");
        map.put(2, "John again");
        System.out.println("Displaying all the entry in map again");
        map.display();
        System.out.println("Size is " + map.size());
        System.out.println("Adding entry with key 17 in map");
        map.put(17, "CS");
        map.display();
        System.out.println("Size is " + map.size());
        System.out.println("Clear map");
        map.clear();
        map.display();
    }
}