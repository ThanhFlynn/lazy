package bai5;

public class RunMain {
    public static void main(String[] args) {
        LopHoc A = new LopHoc();
        A.Input();
        System.out.println("Thông tin lớp học vừa nhập: ");
        A.Output();
        System.out.printf("Có %d sinh viên k14 trong lớp\n",A.CountK14());
        A.SapXep();
        System.out.println("Thông tin lớp học sau khi sắp xếp: ");
        A.Output();
    }
}