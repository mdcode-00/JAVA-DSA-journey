package Stack_Queue;

import java.util.*;
import java.util.PriorityQueue;


public class Practice {
//   private final int[] stack;
//   private final int[] mainStack;

   //int top;


    // . // // //

    int size;
    PriorityQueue<Integer> queue;

    static void main() {
        String c = "[{()}]";
        int[] n = {7,1,5,3,6,4};
        int[] n2 = {7,6,4,3,1};
        int[] n3 = {1,2,3,4,5};
        Practice nn = new Practice(4, new int[]{4,5,8,2});
        System.out.println(nn);
//        Practice stack = new Practice();
//        stack.push(-2);
//        stack.push(0);
//        stack.push(-3);
//        stack.pop();
//        int yy = stack.getMin();
//        int uu = stack.top();
//        System.out.println(yy);
//        System.out.println(uu);
//        System.out.println(maxProfit(n));
//        System.out.println(maxProfit(n2));
//        System.out.println(maxProfit(n3));
//        System.out.println(isValid(c));
    }

    static boolean isValid(String s) {
        if(s == null || s.isEmpty()) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
          if(c == '(' || c == '{' || c == '['){
              stack.push(c);
          }

          // else

         else {
              if(stack.isEmpty()){
                  return false;
              }
              char top = stack.pop();

              if(c == ')' && top != '('){
                  return false;
              }

              if(c == ']' && top != '['){
                  return false;
              }

              if(c == '}' && top != '{'){
                  return false;
              }
          }
        }
        return stack.isEmpty();
    }

    static  int maxProfit(int[] prices) {
    if(prices == null || prices.length == 0){
        return 0;
    }

    int res = 0;

    for(int i =1; i<prices.length; i++){
        if(prices[i-1] < prices[i]){
            int sum = prices[i] - prices[i-1];
            res += sum;
        }
    }

    return res;

    }

//    public Practice() {
//       stack = new int[1000];
//       mainStack = new int[1000];
//       top = -1;
//    }
//
//    public void push(int val) {
//        top++;
//     stack[top] = val;
//
//     if(top == 0){
//         mainStack[top] = val;
//     }else{
//         mainStack[top] = Math.min(val , mainStack[top-1]);
//     }
//    }
//
//    public void pop() {
//        top--;
//    }
//
//    public int top() {
//        return stack[top];
//    }
//
//    public int getMin() {
//     return mainStack[top];
//    }

    public  Practice(int k, int[] nums) {
       size = k;
        queue = new PriorityQueue<>();
        
        for(int i =0; i<nums.length; i++){
            add(nums[i]);
        }
    }

    public int add(int val) {
        queue.offer(val);
        
        if(queue.size() > size){
            queue.poll();
        }

        return queue.peek();
    }
    @Override
    public String toString() {
        return queue.toString();
    }

}
