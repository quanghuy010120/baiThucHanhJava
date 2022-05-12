import java.util.HashSet;
import java.util.Scanner;

public class App56 {
    public static void main(String[] args) {
        String name;
        HashSet<String> hashSetString = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        hashSetString.add("Wilson");
        hashSetString.add("Willia");
        hashSetString.add("Vala");
        hashSetString.add("Wibu");
        hashSetString.add("Hana");
        hashSetString.add("Lukaku");
        hashSetString.add("Hihaha");

        System.out.println("Cac phan tu trong hashSetString: ");
        System.out.println("Nhap phan tu can xoa: ");
        System.out.println(hashSetString);
        name = scanner.nextLine();

        if (hashSetString.contains(name)) {
            hashSetString.remove(name);
            System.out.println("Xoa thanh cong!");
            System.out.println("Cac phan tu trong : ");
            System.out.println(hashSetString);
        } else {
            System.out.print("Xoa khong thanh cong!");
        }
    }
}
