package bai5;

import java.util.Scanner;

public class Nguoi {
    private String hoTen,ngaySinh,queQuan;

    public Nguoi(){}

    public Nguoi(String hoTen, String ngaySinh, String queQuan) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", queQuan='" + queQuan + '\'' +
                '}';
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.printf("Nhập ngày sinh: ");
        ngaySinh = sc.nextLine();
        System.out.printf("Nhập quê quán: ");
        queQuan = sc.nextLine();
    }
    public void Xuat(){
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngày sinh: "+ngaySinh);
        System.out.println("Quê quán: "+queQuan);
    }
}
