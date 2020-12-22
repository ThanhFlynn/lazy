package Class;

public class BanAn {
    private Integer SoBan;
    private int SoNguoi;
    HoaDon hoaDon;

    public BanAn(){}

    public BanAn(Integer soBan, int soNguoi, HoaDon hoaDon) {
        SoBan = soBan;
        SoNguoi = soNguoi;
        this.hoaDon = hoaDon;
    }

    public Integer getSoBan() {
        return SoBan;
    }

    public void setSoBan(Integer soBan) {
        SoBan = soBan;
    }

    public int getSoNguoi() {
        return SoNguoi;
    }

    public void setSoNguoi(int soNguoi) {
        SoNguoi = soNguoi;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }
}
