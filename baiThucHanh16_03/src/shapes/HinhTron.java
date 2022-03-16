package shapes;

import java.util.Scanner;

public class HinhTron {

    final float PI = 3.14f;

    float r;
    float cv;
    float dt;

    public void nhapBanKinh() {
        System.out.println("Hay nhap vao ban kinh hinh tron: ");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextFloat();
    }

    public void tinhChuVi() {
        cv = 2 * PI * r;
    }

    public void tinhDienTinh() {
        dt = PI * r * r;
    }

    public void inChuVi() {
        System.out.println("Chu vi hinh tron: " + cv);

    }

    public void inDienTich() {
        System.out.println("Dien tich hinh tron: " + dt);
    }

}
