package bai1;

import java.util.Scanner;

public class SanPham {
    private String maSanPham,tenSanPham,tenNSX,ngayNhap;

    public SanPham(){}

    public SanPham(String maSanPham, String tenSanPham, String tenNSX, String ngayNhap) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.tenNSX = tenNSX;
        this.ngayNhap = ngayNhap;
    }

    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sp: ");
        maSanPham = sc.nextLine();
        System.out.println("Nhập tên sp: ");
        tenSanPham = sc.nextLine();
        System.out.println("Nhập tên NSX: ");
        tenNSX = sc.nextLine();
        System.out.println("Nhập ngày nhập: ");
        ngayNhap = sc.nextLine();
    }

    public void Output(){
        System.out.println("Mã sp: " +maSanPham);
        System.out.println("Tên sp:" +tenSanPham);
        System.out.println("Tên NSX: "+tenNSX);
        System.out.println("Ngày nhập: "+ngayNhap);
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "maSanPham='" + maSanPham + '\'' +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", tenNSX='" + tenNSX + '\'' +
                ", ngayNhap='" + ngayNhap + '\'' +
                '}';
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getTenNSX() {
        return tenNSX;
    }

    public void setTenNSX(String tenNSX) {
        this.tenNSX = tenNSX;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }
}
