package String_StringBuilder;

public class String_Builder {
    static void main() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder.toString());

//        builder.appendCodePoint(0);
//        builder.deleteCharAt(0);
//          builder.delete( 0 , 4);
//        builder.indexOf("t",0);
        builder.reverse();
        System.out.println(builder);


    }
}
