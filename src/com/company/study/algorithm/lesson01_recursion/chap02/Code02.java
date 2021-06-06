package com.company.study.algorithm.lesson01_recursion.chap02;

import java.util.Scanner;

public class Code02 {
    public static void printChars(String str){
        if (str.length()==0){
            return;
        }else{
            System.out.print(str.charAt(0));
            printChars(str.substring(1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printChars(str);

    }
}
