import java.util.*; // Importing java.util package for StudentMarks

public class Hasmap { // Changed class name to avoid conflict
    public static void main(String[] args) {
        HashMap<String, Integer> Hashmap = new HashMap<>(); // Creating a HashMap instance
        Hashmap.put("Alice", 85);
        Hashmap.put("Bob", 92);
        Hashmap.put("Charlie", 78);
        Hashmap.put("David", 88);

        System.out.println("Initial HashMap: " + Hashmap);
    }
}
