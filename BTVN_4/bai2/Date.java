package bai2;

import java.util.Scanner;

public class Date {
    private Integer D;
    private Integer M;
    private Integer Y;
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ngày: ");
        D = sc.nextInt();
        System.out.println("Tháng: ");
        M = sc.nextInt();
        System.out.println("Năm: ");
        Y = sc.nextInt();
    }
    public void Xuat(){
        System.out.println("Ngày: "+D);
        System.out.println("Tháng: "+M);
        System.out.println("Năm: "+Y);
    }
}
