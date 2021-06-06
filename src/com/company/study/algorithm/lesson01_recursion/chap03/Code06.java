package com.company.study.algorithm.lesson01_recursion.chap03;

import java.util.Scanner;

public class Code06 {
    public static int binarySearch(int items[] ,int target, int begin , int end) {
        if (begin >  end) {
            return -1;
        } else {
            int middle = (begin+end)/2;
           if (target == items[middle]) return middle+1;
           else if(target <  items[middle]){
               return binarySearch(items, target, begin , middle-1);
           }else{
               return binarySearch(items,target,middle+1 ,end);
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
            System.out.println(binarySearch(data,target,0 ,n-1));
        }while (target != 100);



    }
}
