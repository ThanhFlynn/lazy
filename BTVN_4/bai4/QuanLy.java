package bai4;

import java.util.Scanner;

public class QuanLy {
    private String maQl,hoTen;
    public void Nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.printf("Nhập mã quản lý: ");
        maQl = sc.nextLine();
        System.out.printf("Nhập họ tên: ");
        hoTen = sc.nextLine();
    }
    public void Xuat(){
        System.out.println("Thông tin của quản lý: ");
        System.out.println("Mã quản lý: "+maQl);
        System.out.println("Hộ tên: " +hoTen);
    }
}
