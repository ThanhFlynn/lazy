package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a = new int[n+1];
        for(int i=0; i<n;i++) a[i] = sc.nextInt();
        int chon;
        System.out.println("1. Hien thi mang vua tao");
        System.out.println("2. Them 1 phan tu vao vi tri k");
        System.out.println("3. Xoa 1 phan tu o vi tri k");
        System.out.println("4. Dao nguoc mang");
        System.out.println("5. Hien thi phan tu a[1] va cac so chia het cho a[1]");
        System.out.println("6. Thoat");
        do {
            System.out.print("Chon = ");
            chon=sc.nextInt();
            if(chon > 6)
            {
                System.out.println("Nhap sai moi nhap lai!");
                continue;
            }
            if(chon==1) {
                System.out.println("Mảng vừa nhâp");
                for(int i=0; i<n; ++i)
                    System.out.print(a[i] + " ");
                System.out.println();
            }
            if(chon==2){
                System.out.println("Nhập vào vị trí và giá trị cần tìm");
                int index=sc.nextInt(),value=sc.nextInt();
                for(int i=0; i<n; ++i)
                    if(i+1 == index) {
                        for (int j = n; j > i + 1; --j)
                            a[j] = a[j - 1];
                        a[i+1] = value;
                        n++;
                        break;
                    }
                for(int i=0; i<n; ++i)
                    System.out.print(a[i] + " ");
                System.out.println();
            }
            if(chon==3){
                System.out.println("Nhập vao vị trí cần xoá");
                int index = sc.nextInt();
                for(int i=0; i<n; ++i)
                    if(i+1 == index) {
                        for(int j=i; j<n-1; ++j)
                            a[j] = a[j+1];
                        n--;
                        break;
                    }
                for(int i=0; i<n; ++i)
                    System.out.print(a[i] + " ");
                System.out.println();
            }
            if(chon==4){
                System.out.println("Mảng sau khi đảo ngược");
                for(int i=0; i<n; ++i)
                    System.out.print(a[n-i] + " ");
                System.out.println();
            }
            if(chon==5){
                System.out.println("a[1] = " + a[1]);
                System.out.println("Những phần tử trong mảng chia hết cho a[1]");
                for(int it: a){
                    if (it % a[1] == 0) {
                        System.out.print(it + " ");
                    }
                }
                System.out.println();
            }

        }while(chon!=6);
    }
}