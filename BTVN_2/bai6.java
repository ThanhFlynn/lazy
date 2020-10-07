package com.company;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.trim();
        String res = "";
        while(str.contains("  ")) str = str.replaceAll("  "," ");
        for(int i=0; i<str.length(); ++i)
            if(i==0)
                res += Character.toString(str.charAt(i)).toUpperCase().toString();
            else if(i>0 && str.charAt(i-1) == ' ')
                res += Character.toString(str.charAt(i)).toUpperCase().toString();
            else res += str.charAt(i);
        System.out.print(res);
    }
}
