package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        a[0] = sc.nextInt();
        int MIN = a[0];
        int MAX = a[0];
        for(int i=1; i<n; ++i) {
            a[i] = sc.nextInt();
            MIN = Math.min(MIN, a[i]);
            MAX = Math.max(MAX, a[i]);
        }
        System.out.println("Min : " + MIN);
        System.out.println("Max : " + MAX);
        Arrays.sort(a);
        for(int i=0; i<n; ++i)
            System.out.print(a[i] + " ");
    }
}
