package CheetSheet;

import java.util.*; // Imports all Collection frameworks used below

public class ArraysCheatSheet {
    // 1. FIXED: Added 'public' and 'String[] args' so the program can run
    public static void main(String[] args) {

        // --- Array ---
        int[] arr = new int[5];
        int[] arr2 = {1, 2, 3};
        Arrays.sort(arr);

        // --- ArrayList ---
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.get(0);
        list.size();
        list.remove(0);

        // --- HashMap ---
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.getOrDefault("b", 0);
        map.containsKey("a");
        // 2. FIXED: Corrected spelling to 'Map.Entry'
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            e.getKey(); e.getValue(); // Useful shorthand to remember
        }

        // --- Stack / Queue ---
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.pop();
        stack.peek();

        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.peek();
        q.poll();

        // --- String ---
        // 3. FIXED: Changed single quotes to double quotes for String array
        String[] sArr = {"a", "b", "c"};

        // 4. FIXED: Executed String methods on an actual individual String element
        String s = "abc";
        s.charAt(0);
        s.substring(1, 3);

        StringBuilder sb = new StringBuilder();
        sb.append("x");
        sb.toString();

        // --- Loops ---
        int j = 0;
        for (int n = 0; n < j; n++) {}
        for (int x : arr) {}
    }
}