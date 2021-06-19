package com.company.study.algorithm.lesson02_sort.chap08;

import java.util.Scanner;

public class CountingSort {
    public static void main(String[] args) {
        int [] arr = {2,5,3,0,2,3,0,3};

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int counter[] = new int[k+1];

        for (int i=0; i<arr.length; i++){
            counter[arr[i]]++;
        }

       for (int j=0; j<counter.length; j++){

           while (counter[j]-- >0){
               System.out.print(j);
           }

       }

    }
}
