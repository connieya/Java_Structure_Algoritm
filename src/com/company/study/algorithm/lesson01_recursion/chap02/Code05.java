package com.company.study.algorithm.lesson01_recursion.chap02;

import java.util.Scanner;

public class Code05 {
    public static int sum(int n , int []array){
        if (n<=0){
            return 0;
        }else {
            return sum(n-1, array) + array[n-1];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(sum(5,array));
    }
}
