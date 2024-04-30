import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        // List example
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        System.out.println("List Example:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Queue example
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        System.out.println("\nQueue Example:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        // HashMap example
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Charlie", 35);
        System.out.println("\nHashMap Example:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " is " + entry.getValue() + " years old.");
        }
    }
}
