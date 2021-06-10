package com.company.study.algorithm.lesson02_sort.chap01;

public class InsertionSort_1 {
    public static int[] InsertionSort(int arr[]){
        for (int i=1; i<arr.length; i++){

            int target = arr[i];
            int j = i-1;
            while (j>0 && arr[j]>target){
                arr[j+1] =arr[j];
                j--;
            }
            arr[j+1] =target;

        }
        return arr;


    }
    public static void main(String[] args) {
        int arr[] = {6,8,45,66,10,14,19,37,13,94,9,28,98};
        for (int x : arr){
            System.out.print(x+" ");
        }
        InsertionSort(arr);
        System.out.println();
        for (int x : arr){
            System.out.print(x+" ");
        }

    }
}
