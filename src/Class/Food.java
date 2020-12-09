package Class;

public class Food {
    private String MaDoAn;
    private String TenDoAn;
    private String Gia;
    private int GiamGia;
    private int SoLuong;
    
    public Food(){};

    public Food(String MaDoAn, String TenDoAn, String Gia, int GiamGia, int SoLuong) {
        MaDoAn = MaDoAn;
        TenDoAn = TenDoAn;
        Gia = Gia;
        GiamGia = GiamGia;
        SoLuong = SoLuong;
    }

    public String getMaDoAn() {
        return MaDoAn;
    }


    public String getTenDoAn() {
        return TenDoAn;
    }

    public String getGia() {
        return Gia;
    }

    public int getGiamGia() {
        return GiamGia;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setMaDoAn(String MaDoAn) {
        MaDoAn = MaDoAn;
    }

    public void setTenDoAn(String TenDoAn) {
        TenDoAn = TenDoAn;
    }

    public void setGia(String Gia) {
        Gia = Gia;
    }

    public void setGiamGia(int GiamGia) {
        GiamGia = GiamGia;
    }

    public void setSoLuong(int SoLuong) {
        SoLuong = SoLuong;
    }

    @Override
    public String toString() {
        return "Food{" +
                "MaDoAn='" + MaDoAn + '\'' +
                ", TenDoAn='" + TenDoAn + '\'' +
                ", Gia='" + Gia + '\'' +
                ", GiamGia=" + GiamGia +"%"+
                ", SoLuong=" + SoLuong +
                '}';
    }
}
