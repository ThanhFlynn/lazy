package bai2;

public class RunMain {
    public static void main(String[] args) {
        SoPhuc A = new SoPhuc();
        A.Input();
        SoPhuc B = new SoPhuc();
        B.Input();
        System.out.println("Tổng 2 số phức là: ");
        SoPhuc C = new SoPhuc();
        C = C.Cong(A,B);
        System.out.println("Phần thực: " + C.getThuc());
        System.out.println("Phần ảo: " + C.getAo());
        System.out.println("\nHiệu 2 số phức là: ");
        C = C.Tru(A,B);
        System.out.println("Phần thực: " + C.getThuc());
        System.out.println("Phần ảo: " + C.getAo());
    }
}
