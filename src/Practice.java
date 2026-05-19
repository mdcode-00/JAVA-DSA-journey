public class Practice {
    void main() {
   String name = "abcdcba";
   String pal =  "A man, a plan, a canal: Panama";
//   System.out.println(isPalindrome(name));;
        System.out.println(hh(pal));
      char[] tt = {'a','d','f','g','e'};
//        Change(tt);
//        System.out.println(firstUniqChar(name));
//        System.out.println(tt);
    }

    static boolean isPalindrome(String str){

//       if(str == null || str.isEmpty()){
//           return false;
//       }

        str = str.toLowerCase();
        for (int i = 0; i <= str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() -1 - i);

            if(start != end){
                return false;
            }
        }
        return true;
    }

    static void Change(char[] s) {
        if (s == null || s.length == 0) {
            return;
        }
int left = 0;
 int right = s.length-1;

 while(left < right){
     char temp = s[left];
     s[left] = s[right];
     s[right] = temp;

     left++;
     right--;
 }
    }


    public int firstUniqChar(String s) {
        char firstLet = s.charAt(0);
        int count = 1;
        for(int i = 1; i<s.length(); i++){
            if(firstLet == s.charAt(i)){
                count++;
            }
        }
        return count;
    }

    public boolean hh(String s) {

        int left = 0;
        int right = s.length() -1;

        while(left < right){
            String ss = s.toLowerCase();
            char leftch = ss.charAt(left);
            char rightch = ss.charAt(right);

            if(!Character.isLetterOrDigit(leftch)){
                left++;
            }else if(!Character.isLetterOrDigit(rightch)){
                right--;
            }else {
                if(leftch != rightch){
                    return false;
                }

                left++;
                right--;
            }
        }
        return true;
    }








}
