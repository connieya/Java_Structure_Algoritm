package com.company.study.algorithm.lesson02_sort.chap01;

public class SelectionSort_1 {

    public static int[] SelectionSort(int arr[]){
        int j;
        for (int i=arr.length-1; i >=0; i--){
            int last = i;

            for (j=0; j<i; j++){
                if (arr[last] < arr[j]){
                    last =j;
                }
            }

            int temp = arr[last];
            arr[last] = arr[i];
            arr[i] = temp;

        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {45,12,38,29,10,14,37,13,94,28};
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
