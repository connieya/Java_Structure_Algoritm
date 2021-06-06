package com.company.study.algorithm.lesson01_recursion.chap03;

import java.util.Scanner;

public class Code03 {
    public static int search(int data[] , int begin , int end , int target) {
        if (begin > end) {
            return -1;
        } else {
            int middle = (begin+end) /2;
            if (data[middle] ==target){
                return middle+1;
            }
            int index = search(data, begin,middle-1,target);
            if (index != -1){
                return index;
            }else {
                return search(data,middle+1,end,target);
            }
        }
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
            System.out.println(search(data,0 ,n-1,target));
        }while (target != -100);
    }
}
