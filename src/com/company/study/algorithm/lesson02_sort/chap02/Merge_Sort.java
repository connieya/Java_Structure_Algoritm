package com.company.study.algorithm.lesson02_sort.chap02;

public class Merge_Sort {
    public static void main(String[] args) {
        int [] arr = { 23, 11,25,9,17,91,67,43};

        for (int x : arr){
            System.out.print(x+ " ");
        }
        mergeSortDivide(arr, 0, arr.length-1);
        System.out.println();

        for (int x : arr){
            System.out.print(x+ " ");
        }
    }
    private static void mergeSortDivide(int[]arr , int left  , int right){
        if (left < right){
            int mid = (left+right)/2;

            mergeSortDivide(arr, left,mid);

            mergeSortDivide(arr, mid+1,right);

            merge(arr, left,mid,right);
        }
    }
    private static void merge(int [] arr ,int left , int mid ,int right){
        int i = left;
        int j =  mid+1;
        int p = left;

        int[] temp = new int[arr.length];
        while (i<= mid && j<= right){
            if (arr[i]<arr[j]){
                temp[p++] = arr[i++];
            }else {
                temp[p++] =  arr[j++];
            }
        }

        while (i<= mid){
            temp[p++] = arr[i++];
        }
        while (j<=right){
            temp[p++] =  arr[j++];
        }

        for (int index = left; index<p; index++){
            arr[index] = temp[index];
        }
    }
}
