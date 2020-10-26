package bai1;

import java.util.Scanner;

public class DieuHoa extends SanPham{
    private Double congSuat,giaBan;

    public DieuHoa(){}

    public DieuHoa(String maSanPham, String tenSanPham, String tenNSX, String ngayNhap, Double congSuat, Double giaBan) {
        super(maSanPham, tenSanPham, tenNSX, ngayNhap);
        this.congSuat = congSuat;
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return "DieuHoa{" +
                super.toString() +
                "congSuat=" + congSuat +
                ", giaBan=" + giaBan +
                '}';
    }

    public void Input(){
        super.Input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập công suất: ");
        congSuat = sc.nextDouble();
        System.out.println("Nhập giá bán: ");
        giaBan = sc.nextDouble();
    }
    public void Output(){
        super.Output();
        System.out.println("Công suất: " + congSuat);
        System.out.println("Giá bán: " + giaBan);
    }

    public Double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(Double congSuat) {
        this.congSuat = congSuat;
    }

    public Double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Double giaBan) {
        this.giaBan = giaBan;
    }
}
