import java.util.LinkedHashSet;
import java.util.Set;

public class App60 {
    public static void main(String[] args) {

        Set<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("JAVA");
        linkedHashSet.add("PHP");
        linkedHashSet.add("C#");
        linkedHashSet.add("C++");

        for (String str : linkedHashSet) {
            System.out.println(str);
        }
    }
}
