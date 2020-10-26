package bai3;

import java.util.Scanner;

public class SanPham {
    private String maSP,tenSP;
    private int soLuong;
    private Double donGia;

    public SanPham(){}

    public SanPham(String maSP, String tenSP, int soLuong, Double donGia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Double getDonGia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }

    public void InputSP(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập mã SP: ");
        maSP = sc.nextLine();
        System.out.printf("Nhập tên SP: ");
        tenSP = sc.nextLine();
        System.out.printf("Nhập số lượng: ");
        soLuong = sc.nextInt();
        System.out.printf("Nhập đơn giá: ");
        donGia = sc.nextDouble();
    }
    public void OutputSP(){
        System.out.println("Mã SP: "+maSP);
        System.out.println("Tên SP: "+tenSP);
        System.out.println("Số lượng: "+soLuong);
        System.out.println("Đơn giá: "+donGia);
        System.out.println("Thành tiền: "+(soLuong*donGia));
    }
}
