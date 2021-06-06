package com.company.study.algorithm.lesson01_recursion.chap02;

import java.util.Scanner;

public class Code01 {
    public static int length(String str){
        if (str.equals("")){
            return 0;
        }else {
            return 1+length(str.substring(1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(length(str));
    }
}
