package Bai1;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Sach[] a;
        int n;
        System.out.println("Nhap so sach: ");
        Scanner Nhap = new Scanner(System.in);
        n = Nhap.nextInt();
        a = new Sach[n];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Nhap thong tin sach thu " + (i + 1) + ":");
            a[i] = new Sach();
            a[i].Nhap();
        }
        System.out.println("Thong tin sach vua Nhap: ");
        for (int i = 0; i < a.length; i++) {
            a[i].Xuat();
        }
    }
}