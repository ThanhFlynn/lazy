package bai5;

import java.util.ArrayList;
import java.util.Scanner;

public class LopHoc {
    public String maLH,tenLH,ngayMo,giaoVien;
    public ArrayList<SinhVien> list = new ArrayList<>();
    public int n;

    public LopHoc(){}

    public LopHoc(String maLH, String tenLH, String ngayMo, String giaoVien, ArrayList<SinhVien> list, int n) {
        this.maLH = maLH;
        this.tenLH = tenLH;
        this.ngayMo = ngayMo;
        this.giaoVien = giaoVien;
        this.list = list;
        this.n = n;
    }

    public String getMaLH() {
        return maLH;
    }

    public void setMaLH(String maLH) {
        this.maLH = maLH;
    }

    public String getTenLH() {
        return tenLH;
    }

    public void setTenLH(String tenLH) {
        this.tenLH = tenLH;
    }

    public String getNgayMo() {
        return ngayMo;
    }

    public void setNgayMo(String ngayMo) {
        this.ngayMo = ngayMo;
    }

    public String getGiaoVien() {
        return giaoVien;
    }

    public void setGiaoVien(String giaoVien) {
        this.giaoVien = giaoVien;
    }

    public ArrayList<SinhVien> getList() {
        return list;
    }

    public void setList(ArrayList<SinhVien> list) {
        this.list = list;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập mã lớp học: ");
        maLH = sc.nextLine();
        System.out.printf("Nhập tên lớp học: ");
        tenLH = sc.nextLine();
        System.out.printf("Nhập ngày mở: ");
        ngayMo = sc.nextLine();
        System.out.printf("Nhập số lượng sinh viên: ");
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1));
            SinhVien x = new SinhVien();
            x.Input();
            list.add(x);
        }
        System.out.printf("Nhập giáo viên");
        giaoVien = sc.nextLine();
    }

    public void Output(){
        System.out.println("Mã lớp học: " + maLH);
        System.out.println("Tên lớp học: " + tenLH);
        System.out.println("Ngày mở: " + ngayMo);
        System.out.println("Giáo viên: "+giaoVien);
        System.out.println("Thông tin sinh viên trong lớp: ");
        for(SinhVien i : list)
            i.Output();
    }

    public int CountK14(){
        int Count = 0;
        for(SinhVien i : list)
            if(i.getKhoaHoc() == 14)
                Count++;
        return Count;
    }

    public void SapXep(){
        for(int i = 0; i < list.size() - 1; i++){
            for(int j = i+1; j<list.size(); j++){
                if(list.get(i).getKhoaHoc() > list.get(j).getKhoaHoc()){
                    SinhVien tg = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, tg);
                }
            }
        }
    }
}
