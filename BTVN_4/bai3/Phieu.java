package bai3;

import java.util.Scanner;

public class Phieu {
    private String maPhieu;
    private Hang[] x;
    private int n;
    public void Nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập mã phiếu: ");
        maPhieu = sc.nextLine();
        System.out.println("Nhập số hàng hóa: ");
        n = sc.nextInt();
        x = new Hang[n];
        for(int i=0; i<n; ++i){
            System.out.println("Nhập thông tin mặt hàng thứ: "+ (i+1));
            x[i] = new Hang();
            x[i].Nhap();
        }
    }
    public void Xuat(){
        System.out.println("Mã phiếu: "+maPhieu);
        System.out.println("Thông tin các mặt hàng: ");
        for(int i=0; i< n; ++i){
            System.out.println("Thông tin mặt hàng " + (i+1) + " :");
            x[i].Xuat();
        }
    }
}
