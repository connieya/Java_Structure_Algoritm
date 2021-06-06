package com.company.study.algorithm.lesson01_recursion.chap02;

import java.util.Scanner;

public class Code04_1 {
    public static void printBinary(int n){
        if (n<2)
            System.out.print(n);
        else{
            printBinary(n/2);
            System.out.print(n%2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printBinary(n);


    }
}
