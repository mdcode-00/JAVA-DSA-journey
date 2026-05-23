package Stack_Queue;

public class QueueMain {

    static void main() throws Exception {
//        CustomQueue queue = new CustomQueue(5);
//        CircularQueue queue = new CircularQueue(5);
        CircularQueue queue = new DynamicQueue(5);
        queue.insert(34);
        queue.insert(5);
        queue.insert(57);
        queue.insert(8);
        queue.insert(1);
        queue.insert(1);
        queue.insert(1);
        queue.insert(1);

        queue.display();
        System.out.println(queue.remove());
       queue.insert(133);
        queue.display();


        System.out.println(queue.remove());
       queue.insert(88);
        queue.display();

    }
}
