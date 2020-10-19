package bai2;

import java.util.Scanner;

public class NhanSu {
    private String maNhanSu,hoTen;
    private Date NS;
    public void Nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Mã nhân sự: ");
        maNhanSu = sc.nextLine();
        System.out.println("Họ tên: ");
        hoTen = sc.nextLine();
        NS = new Date();
        NS.Nhap();
    }
    public void Xuat(){
        System.out.println("Mã nhân sự: "+maNhanSu);
        System.out.println("Họ tên: "+hoTen);
        NS.Xuat();
    }
}
