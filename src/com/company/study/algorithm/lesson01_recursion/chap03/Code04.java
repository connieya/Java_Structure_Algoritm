package com.company.study.algorithm.lesson01_recursion.chap03;

import java.util.Scanner;

public class Code04 {
    public static int findMax(int data[] , int begin , int end) {
        if (begin == end) {
            return data[begin];
        } else {
            return Math.max(data[begin], findMax(data, begin+1,end));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int data[] = new int[n];
        for (int i=0; i<n; i++){
            data[i] =sc.nextInt();
        }

        System.out.println(findMax(data,0 ,n-1));

    }
}
