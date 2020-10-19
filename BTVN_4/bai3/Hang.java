package bai3;

import java.util.Scanner;

public class Hang {
    private String maHang,tenHang;
    private Integer donGia;
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã hàng: ");
        maHang = sc.nextLine();
        System.out.println("Nhập tên hàng: ");
        tenHang = sc.nextLine();
        System.out.println("Nhập đơn giá: ");
        donGia = sc.nextInt();
    }
    public void Xuat(){
        System.out.println("Mã hàng: "+maHang);
        System.out.println("Tên hàng: "+tenHang);
        System.out.println("Đơn giá: "+donGia);
    }
}
