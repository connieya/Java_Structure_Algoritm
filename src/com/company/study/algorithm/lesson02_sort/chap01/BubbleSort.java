package com.company.study.algorithm.lesson02_sort.chap01;

public class BubbleSort {

    public static int[] bubbleSort(int arr[]){
        for (int i=0; i<arr.length-1; i++){
            for (int j=0; j< arr.length-i-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {29,10,14,37,13};
        for (int c : arr){
            System.out.print(c+" ");
        }
        bubbleSort(arr);
        System.out.println();
        for (int x : arr){
            System.out.print(x+" ");
        }

    }
}
