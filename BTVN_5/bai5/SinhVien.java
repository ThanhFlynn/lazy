package bai5;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class SinhVien extends Nguoi{
    public String maSV,nganh;
    public int khoaHoc;

    public SinhVien(){
    }

    public SinhVien(String hoTen, String ngaySinh, String queQuan, String maSV, String nganh, int khoaHoc) {
        super(hoTen, ngaySinh, queQuan);
        this.maSV = maSV;
        this.nganh = nganh;
        this.khoaHoc = khoaHoc;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public int getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(int khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSV='" + maSV + '\'' +
                super.toString() +
                ", nganh='" + nganh + '\'' +
                ", khoaHoc=" + khoaHoc +
                '}';
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập mã SV: ");
        maSV = sc.nextLine();
        super.Nhap();
        System.out.printf("Nhập ngành: ");
        nganh = sc.nextLine();
        System.out.printf("Nhập khóa học: ");
        khoaHoc = sc.nextInt();
        sc.nextLine();
    }
    public void Output(){
        System.out.println("Mã SV: "+maSV);
        super.Xuat();
        System.out.println("Ngành: "+nganh);
        System.out.println("Khóa học: "+khoaHoc);
    }
}
