package String_StringBuilder;

import java.util.ArrayList;

public class operators {
    static void main() {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((char)('a' + 3));

        System.out.println("a" +1);
         // this is same as after a few steps: "a" + "1"
        // Integer will be converted to Integer that will call toString();;

        System.out.println("mond" + new ArrayList<>());
        System.out.println("mohd" + new Integer(35));
        String ans = new Integer(66) + "" + new ArrayList<>();
        // we only want String to unite everyone;;;
        System.out.println(ans);
        System.out.println("a" + 'b');
    }

}
