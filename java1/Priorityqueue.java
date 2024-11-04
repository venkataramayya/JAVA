
import java.util.*;
public class Priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq= new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(80);
        pq.add(20);
        pq.offer(30);
        pq.add(40);
        pq.add(50);
        System.out.println(pq);
        System.out.println(pq.remove(90));


while(!pq.isEmpty()){
    System.out.println(pq.poll());
}    
    }
    
}
