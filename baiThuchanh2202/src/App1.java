import java.util.Scanner;

public class App1 {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * main
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("Nhập số nguyên dương a = ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên dương b = ");
        int b = scanner.nextInt();
        // tính USCLN của a và b
        System.out.println("USCLN của " + a + " và " + b
                + " là: " + USCLN(a, b));
    }

    /**
     * Tìm ước số chung lớn nhất (USCLN)
     * 
     * @param a: số nguyên dương
     * @param b: số nguyên dương
     * @return USCLN của a và b
     */
    public static int USCLN(int a, int b) {
        if (b == 0)
            return a;
        return USCLN(b, a % b);
    }

}
