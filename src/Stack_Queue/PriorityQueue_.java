package Stack_Queue;

import java.util.*;

public class PriorityQueue_ {
    static void main() {
//        Queue<Double> queue = new LinkedList<>();
//        Queue<Double> queue = new PriorityQueue<>();
//        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());

//        queue.offer(3.2);
//        queue.offer(5.0);
//        queue.offer(6.0);
//        queue.offer(2.0);
//        queue.offer(2.9);

        queue.offer("C");
        queue.offer("B");
        queue.offer("D");
        queue.offer("A");
        queue.offer("E");

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }

}
