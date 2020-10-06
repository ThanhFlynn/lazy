package com.company;

import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        for (int i = 1; i <= n; ++i)
            if(i==1 || i==n)
            {
                for (int j = 1; j <= m; ++j)
                    System.out.print("*");
                System.out.println();
            }
            else
            {
                for(int j=1; j<=m; ++j)
                    if(j==1||j==m)
                        System.out.print("*");
                    else System.out.print(" ");
                System.out.println();
            }
    }
}
