package com.company.study.algorithm.lesson01_recursion.chap03;

import java.util.Scanner;

public class Code06_1 {
    public static int binarySearch(String  items[] ,String  target, int begin , int end) {
        if (begin >  end) {
            return -1;
        } else {
            int middle = (begin+end)/2;
            int compResult = target.compareTo(items[middle]);
            if (compResult == 0){
                return middle+1;
            }else if(compResult<0){
               return binarySearch(items, target, begin , middle-1);
           }else{
               return binarySearch(items,target,middle+1 ,end);
           }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String  items[] = new String[n];
        for (int i=0; i<n; i++){
            items[i] =sc.next();
        }
        String target;
        do {
            target = sc.next();
            System.out.println(binarySearch(items,target,0 ,n-1));
        }while (!target.equals("end"));



    }
}
