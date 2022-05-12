import java.util.LinkedHashMap;
import java.util.Map;

public class App94 {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
        hm.put(100, "Java");
        hm.put(200, "PHP");
        hm.put(101, "C Sharp");
        hm.put(102, "C++");

        for (Map.Entry<Integer, String> m : hm.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());

        System.out.println("Before invoking remove method: " + hm);
        hm.remove(101);
        System.out.println("After invoking remove method: " + hm);

    }

}
