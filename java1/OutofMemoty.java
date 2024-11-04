import java.util.ArrayList;
import java.util.List;

public class OutofMemoty {
    public static void main(String[] args) {
        List<int[]> memoryLeak = new ArrayList<>();
        
        // Infinite loop to keep allocating memory
        while (true) {
            // Creating a large array of integers
            int[] largeArray = new int[1_000_000];  // 1 million integers
            memoryLeak.add(largeArray);
        }
    }
}
