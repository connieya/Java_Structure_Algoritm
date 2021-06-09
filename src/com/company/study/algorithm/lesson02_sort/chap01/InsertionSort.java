package com.company.study.algorithm.lesson02_sort.chap01;

public class InsertionSort {
    public static int[] InsertionSort(int arr[]){
        for (int i=1; i<arr.length; i++){
            int index = i;
            for (int j=i-1; j>=0; j--){
                if (arr[j]>arr[index]){
                    int tmp = arr[index];
                    arr[index] = arr[j];
                    arr[j] = tmp;
                }else {

                    break;
                }

            }
        }
        return arr;


    }
    public static void main(String[] args) {
        int arr[] = {45,66,10,14,37,13,94,28,98};
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
