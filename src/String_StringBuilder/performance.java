package String_StringBuilder;

public class performance {
    static void main() {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
         series = series + ch;
        }
        // this is not good performance and lot of memory wast;
        System.out.println(series);
    }

}
