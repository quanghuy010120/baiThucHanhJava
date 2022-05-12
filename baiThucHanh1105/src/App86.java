import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class App86 {

    HashMap<String, String> hashMap1 = new HashMap<>();

    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("JAVA", "Java");
        hashMap.put("PHP", "PHP");
        hashMap.put("C#", "C Sharp");
        hashMap.put("C++", "C++");

        Set<Map.Entry<String, String>> setHashMap = hashMap.entrySet();
        System.out.println("Cac entry co trong setHashMAp: ");
        System.out.print(setHashMap);
    }
}
