package Stack_Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class all_ {
    static void main() {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(34);
//        stack.push(45);
//        stack.push(2);
//        stack.push(9);
//        stack.push(18);
//
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//       System.out.println(stack.pop());
//
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(3);
//        queue.add(9);
//        queue.add(9);
//        queue.add(8);
//        queue.add(66);
//        queue.add(9);
//
//        System.out.println(queue.peek());
//        System.out.println(queue.remove());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(22);
        deque.addFirst(9);
        deque.addLast(5);
        deque.removeFirst();
        System.out.println(deque);

    }

}
