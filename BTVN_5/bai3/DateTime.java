package bai3;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class DateTime {
    private int ngay,thang,nam;

    public DateTime(){}

    public DateTime(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public void InputDate(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập ngày: ");
        ngay = sc.nextInt();
        System.out.printf("Nhập tháng: ");
        thang = sc.nextInt();
        System.out.printf("Nhập năm: ");
        nam = sc.nextInt();
    }
    public void OutputDate(){
        System.out.printf("DD/MM/YYYY: %d/%d/%d\n", ngay,thang,nam);
    }

}
