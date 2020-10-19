package Bai1;

import java.util.Scanner;

public class Sach {
    private String maSach;
    private String tenSach;
    private String NXB;
    private int soTrang;
    private double giaTien;
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sach: ");
        maSach = sc.nextLine();
        System.out.println("Nhap ten sach: ");
        tenSach = sc.nextLine();
        System.out.println("Nhap ten nha xuat ban: ");
        NXB = sc.nextLine();
        System.out.println("Nhap so trang: ");
        soTrang = sc.nextInt();
        System.out.println("Nhap gia tien: ");
        giaTien = sc.nextDouble();
        sc.nextLine();
    }
    public void Xuat(){
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Nxb: " + NXB);
        System.out.println("So trang: " + soTrang);
        System.out.println("Gia tien: " + giaTien);
    }
}