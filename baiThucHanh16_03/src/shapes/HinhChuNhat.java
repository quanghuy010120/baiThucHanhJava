package shapes;

import java.util.Scanner;

public class HinhChuNhat {

    float dai;
    float rong;
    float cv;
    float dt;

    public void nhapChieuDai() {
        System.out.println("Hay nhap vao chieu dai hinh chu nhat: ");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextFloat();

    }

    public void nhapChieuRong() {
        System.out.println("Hay nhap vao chieu rong hinh chu nhat: ");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextFloat();
    }

    public void tinhChuVi() {
        cv = 2 * (dai + rong);
    }

    public void tinhDienTinh() {
        dt = dai * rong;
    }

    public void inChuVi() {
        System.out.println("Chu vi hinh chu nhat: " + cv);

    }

    public void inDienTich() {
        System.out.println("Dien tich hinh chu nhat: " + dt);
    }

}
