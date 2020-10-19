package bai4;

import java.util.Scanner;

public class May {
    private String maMay,kieuMay,tinhTrang;
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập mã máy: ");
        maMay = sc.nextLine();
        System.out.printf("Nhập kiểu máy: ");
        kieuMay = sc.nextLine();
        System.out.printf("Nhập tình trạng: ");
        tinhTrang = sc.nextLine();
    }
    public void Xuat(){
        System.out.println("Mã máy: "+maMay);
        System.out.println("Kiểu máy: "+kieuMay);
        System.out.println("Tình trạng: "+tinhTrang);
    }
}
