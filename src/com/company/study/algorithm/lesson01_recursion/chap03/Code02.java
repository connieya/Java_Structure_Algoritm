package com.company.study.algorithm.lesson01_recursion.chap03;

import java.util.Scanner;

public class Code02 {
    public static int search(int data[] , int begin , int end , int target){
     if (begin>end) return -1;
     else if(data[begin] == target){
         return begin+1;
     }else{
         return search(data , begin+1 , end, target);
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
