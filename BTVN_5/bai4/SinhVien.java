package bai4;

import java.util.Scanner;

public class SinhVien {
    private String id;
    private String name;
    private String addRess;
    private Integer age;
    private Double gpa;

    public SinhVien(){}

    public SinhVien(String id, String name, String addRess, Integer age, Double gpa) {
        this.id = id;
        this.name = name;
        this.addRess = addRess;
        this.age = age;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddRess() {
        return addRess;
    }

    public void setAddRess(String addRess) {
        this.addRess = addRess;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập id: ");
        id = sc.nextLine();
        System.out.printf("Nhập tên: ");
        name = sc.nextLine();
        System.out.printf("Nhập tuổi: ");
        age = sc.nextInt();
        System.out.printf("Nhập địa chỉ: ");
        sc.nextLine();
        addRess = sc.nextLine();
        System.out.printf("Nhập GPA: ");
        gpa = sc.nextDouble();
    }
    public void Output(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Address: "+addRess);
        System.out.println("GPA: "+gpa);
    }
}
