package com.company.study.algorithm.lesson01_recursion.chap02;

import java.util.Scanner;

public class Code03 {
    public static void printCharsReverse(String str){
        if (str.length()==0)
            return;
        else {
            printCharsReverse(str.substring(1));
            System.out.print(str.charAt(0));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
       printCharsReverse(str);

    }
}
