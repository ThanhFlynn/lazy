package bai4;

import java.util.Scanner;

public class PhongMay {
    private String maPhong,tenPhong,dienTich;
    private QuanLy x;
    private May[] y;
    private Integer n;
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập mã phòng: ");
        maPhong = sc.nextLine();
        System.out.printf("Nhập tên phòng: ");
        tenPhong = sc.nextLine();
        System.out.printf("Nhập diện tích: ");
        dienTich = sc.nextLine();
        System.out.println("\nNhập thông tin quản lý: ");
        x = new QuanLy();
        x.Nhap();
        System.out.println("Nhập số lượng máy: ");
        n = sc.nextInt();
        y = new May[n];
        System.out.println("Nhập thông tin các máy: ");
        for(int i=0; i<n; ++i){
            y[i] = new May();
            y[i].Nhap();
        }
    }
    public void Xuat(){
        System.out.println("Mã phòng: "+maPhong);
        System.out.println("Tên phòng: "+tenPhong);
        System.out.println("Diện tích: "+dienTich);
        x.Xuat();
        System.out.println("Thông tin các máy: ");
        for(int i=0; i<n; ++i){
            System.out.println("Thông tin máy thứ " + (i+1) +" :");
            y[i].Xuat();
        }
    }
}
