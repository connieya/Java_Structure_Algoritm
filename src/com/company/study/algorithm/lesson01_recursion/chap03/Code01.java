package com.company.study.algorithm.lesson01_recursion.chap03;

import java.util.Scanner;

public class Code01 {
    public static int search(int data[] , int n , int target){
        for (int i=0; i<n; i++){
            if (data[i] == target){
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int data[] = new int[n];
        for (int i=0; i<n; i++){
            data[i] =sc.nextInt();
        }
        int target;
        do {
             target = sc.nextInt();
            System.out.println(search(data,n ,target));
        }while (target != -100);
    }
}
