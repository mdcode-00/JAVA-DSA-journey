package String_StringBuilder;

public class Comparison {
    static void main() {
        String a = "hussain";
        String b = "hussain";
        String c = a;
        System.out.println(c==a);
// comparison == method;
//        System.out.println(a==b); // true

  String name1 = new String("hussain");
  String name2 = new String("hussain");

//        System.out.println(name1 == name2); // give me false

        System.out.println(name1.equals(name2)); // give true because of method it's only care about values;
//        System.out.println(name1[0]); we do this
        System.out.println(name1.charAt(0)); // but this;
    }
}
