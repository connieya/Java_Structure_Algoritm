package com.company.study.algorithm.lesson01_recursion.chap03;

import java.util.Scanner;

public class Code05 {
    public static int findMax(int data[] , int begin , int end) {
        if (begin == end) {
            return data[begin];
        } else {
            int middle = (begin+end)/2;
            int max1 = findMax(data,begin,middle);
            int max2 = findMax(data, middle+1 ,end);
            return Math.max(max1, max2);
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
