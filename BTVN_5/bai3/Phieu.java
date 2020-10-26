package bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class Phieu {
    private String maPhieu,tenPhieu;
    private DateTime a;
    private ArrayList<SanPham> x;
    private int n;

    public void InputPhieu(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập mã phiếu: ");
        maPhieu = sc.nextLine();
        System.out.printf("Nhập tên phiếu: ");
        tenPhieu = sc.nextLine();
        a = new DateTime();
        a.InputDate();
        System.out.printf("Nhập số sản phẩm: ");
        n = sc.nextInt();
        x = new ArrayList<>();
        for(int i=0; i<n; ++i){
            System.out.println("Nhập thông tin sản phẩm thứ: " + i);
            SanPham c = new SanPham();
            c.InputSP();
            x.add(c);
        }
    }
    public void OutputPhieu(){
        System.out.println("Mã phiếu: "+maPhieu);
        System.out.println("Tên phiếu: "+tenPhieu);
        a.OutputDate();
        System.out.printf("Thông tin %d sản phẩm: \n",n);
        for(int i=0; i<n; ++i)
            x.get(i).OutputSP();
    }
}
