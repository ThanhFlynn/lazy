package com.company;

import java.util.Scanner;
import java.util.Vector;

import static com.company.bai4.ngto;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; ++i)
            a[i] = sc.nextInt();
        Vector<Integer> isPrime = new Vector<Integer>(n);
        for(int i=2; i<=n*n; ++i)
            if(ngto(i)) isPrime.add(i);
        int sum = 0;
        for(int i=0; i<n; ++i)
            if(ngto(a[i])){
                sum += a[i] + isPrime.elementAt(i) - (i+1);
            }
            else sum += a[i];
        System.out.println(sum);
    }
    public static boolean ngto(int x){
        for(int i=2; i*i <= x; ++i)
            if(x%i==0) return false;
        return (x>=2);
    }
}
