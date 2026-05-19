package String_StringBuilder;

import java.util.Arrays;

public class Methods {
    static void main() {
        String name  = "Mohd Hussain hello";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);// real one never change;
        System.out.println(name.indexOf('a'));
        System.out.println("      mohd      ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
