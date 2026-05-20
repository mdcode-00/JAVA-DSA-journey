package HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class practice {
    static void main() {
        int[] jj = {1,2,3,45,1};
        String s = "anagram";
        String t = "nagaram";
        int[] nums = {2,7,11,15};
        int target = 9;
//        System.out.println(isAnagram(s,t));
//        System.out.println(isAnagramB(s,t));
        int[] two = twoSum2(nums,target);
        System.out.println(Arrays.toString(two));
//        System.out.println(containsDuplicate(jj));
    }

    static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.contains(nums[i])){
                return true;
            }
            map.add(nums[i]);
        }
        return false;
    }

    static boolean isAnagram(String s, String t) {
if(s.length() != t.length()){
    return false;
}
HashMap<Character, Integer> map = new HashMap<>();

for(int i =0; i<s.length();i++){
    map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) , 0) +1 );
}

System.out.println(map);

        for (int i = 0; i < t.length(); i++) {
            char f = t.charAt(i);
            if(!map.containsKey(f)){
                return false;
            }

            map.put(f,map.get(f) -1);

            if(map.get(f)< 0){
                return false;
            }
        }


return true;
    }

    static boolean isAnagramB(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
         int[] feq = new int[26];

        for(int i =0; i<s.length(); i++){
            System.out.println(feq[s.charAt(i) - 'a']);
            feq[s.charAt(i) - 'a']++;
            feq[t.charAt(i) - 'a']--;
        }

        for(int num : feq){
            if(num != 0){
                return false;
            }
        }

        return true;
    }

// brute force
    static int[] twoSum(int[] nums, int target) {
        if(nums == null || target == 0){
            return nums;
        };

        for(int i =0; i<nums.length; i++) {
       for(int j = i+1; j<nums.length; j++)
           if(nums[j] + nums[i] == target){
               return new int[] { i, j };

                          }
       }
       return new int[0];
    }

    static int[] twoSum2(int[] nums, int target) {
        if(nums.length < 1 || target == 0){
            return nums;
        };
 Map<Integer, Integer> map = new HashMap<>();

        for(int i =0; i<nums.length; i++) {
           int findNum = target - nums[i];

           if(map.containsKey(findNum)){
               return new int[]{map.get(findNum), i};
           }

           map.put(nums[i] , i);
        }
        return new int[0];
    }

}
