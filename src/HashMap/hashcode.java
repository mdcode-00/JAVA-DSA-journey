package HashMap;
import java.util.*;
public class hashcode {
    static void main() {
//        String name = "mohd";
//        Integer a = 7896;
//        int codeA = name.hashCode();
//       int code = a.hashCode();
//        System.out.println(code);

        HashMap<String , Integer> map = new HashMap<>();
        map.put("mohd" , 20);
        map.put("ali" , 96);
        map.put("rahul" , 77);
        map.put("jorden" , 88);
        map.put("jone" , 100);

        System.out.println(map.get("ali"));
        System.out.println(map.getOrDefault("jacob" , 101));


    HashSet<Integer>  set = new HashSet<>();


        set.add(3);
        set.add(44);
        set.add(38);
        set.add(56);
        set.add(76);
        set.add(99);
        set.add(34);


        System.out.println(set);


        TreeMap<String ,Integer> tree = new TreeMap<>();
        tree.put("rahul" , 77);
        tree.put("jorden" , 88);
        tree.put("jone" , 100);
        System.out.println(tree.values());

    }





}
