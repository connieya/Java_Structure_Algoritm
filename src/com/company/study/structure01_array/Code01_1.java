package com.company.study.structure01_array;

public class Code01_1 {
    public static void main(String[] args) {
       int arr[] = new int[]{80,21,76,30,130};
       int rank=1;
       for (int i=0; i<arr.length; i++){

           if (arr[i]> 50){
               rank++;
           }
           arr[i] = rank;

           rank = 1;
       }


       for (int x : arr){
           System.out.print(x +" ");
       }
    }

}
