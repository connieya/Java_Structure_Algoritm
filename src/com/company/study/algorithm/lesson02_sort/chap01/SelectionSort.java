package com.company.study.algorithm.lesson02_sort.chap01;

public class SelectionSort {

    public static int[] SelectionSort(int arr[]){
        int j;
        for (int i=0; i<arr.length-1; i++){
            int min_index = i;

            for (j=i+1; j<arr.length; j++){
                if (arr[min_index] > arr[j]){
                    min_index =j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;

        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {29,10,14,37,13};
        for (int x : arr){
            System.out.print(x+" ");
        }
        SelectionSort(arr);
        System.out.println();
        for (int x : arr){
            System.out.print(x+" ");
        }

    }
}
