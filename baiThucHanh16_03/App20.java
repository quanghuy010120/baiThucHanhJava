package main;

import shapes.HinhChuNhat;
import shapes.HinhTron;

public class App20 {

    public static void main(String[] args) {
        // Khai bao cac doi tuong bang tu khoa new
        HinhTron hinhTron = new HinhTron();
        HinhChuNhat hinhChuNhat = new HinhChuNhat();

        // Nhap du lieu vao cho hinhTron, tinh chu vi, dien tich
        hinhTron.nhapBanKinh();
        hinhTron.tinhChuVi();
        hinhTron.tinhDienTinh();
        hinhTron.inChuVi();
        hinhTron.inDienTich();

        System.out.print("\n\n");

        // Nhap du lieu cho hinhChunhat, tinh chu vi , dien tich

        hinhChuNhat.nhapChieuDai();
        hinhChuNhat.nhapChieuRong();
        hinhChuNhat.tinhChuVi();
        hinhChuNhat.tinhDienTinh();
        hinhChuNhat.inChuVi();
        hinhChuNhat.inDienTich();

    }

}
