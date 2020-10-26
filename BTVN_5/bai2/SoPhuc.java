package bai2;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class SoPhuc {
    private Double thuc,ao;

    public SoPhuc(){}

    public SoPhuc(Double thuc, Double ao) {
        this.thuc = thuc;
        this.ao = ao;
    }

    public Double getThuc() {
        return thuc;
    }

    public void setThuc(Double thuc) {
        this.thuc = thuc;
    }

    public Double getAo() {
        return ao;
    }

    public void setAo(Double ao) {
        this.ao = ao;
    }

    @Override
    public String toString() {
        return "SoPhuc{" +
                "thuc=" + thuc +
                ", ao=" + ao +
                '}';
    }

    public SoPhuc Cong(SoPhuc A,SoPhuc B){
        SoPhuc C = new SoPhuc();
        C.ao = A.ao + B.ao;
        C.thuc = A.thuc + B.thuc;
        return C;
    }

    public SoPhuc Tru(SoPhuc A,SoPhuc B){
        SoPhuc C = new SoPhuc();
        C.ao = A.getAo() - B.getAo();
        C.thuc = A.getThuc() - B.getThuc();
        return C;
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập thực: ");
        thuc = sc.nextDouble();
        System.out.printf("Nhập ảo: ");
        ao = sc.nextDouble();
    }
    public void Output(){
        System.out.println("Phần thực: " + thuc);
        System.out.println("Phần ảo: " + ao);
    }
}
