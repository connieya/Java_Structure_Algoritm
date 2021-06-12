package com.company.study.algorithm.lesson02_sort.chap02;

import java.util.Scanner;

public class Merge_Sort2 {
    private static int[] sorted;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sorted = new int[n];
        out_put(arr);
        merge_sort(arr,0,arr.length-1);
        out_put(arr);

    }
    //Bottom-Up 방식 구현
    private static void merge_sort(int[]a , int left , int right){
        for (int size =1; size<=right; size+=size){
            for (int l=0; l<=right-size; l+=(2*size)){
                int low = l;
                int mid = l+size-1;
                int high = Math.min(l+(2*size)-1, right);
                merge(a,low,mid,high);

            }

        }
    }
    private static void merge(int []a, int left , int mid , int right){
        int l = left; // 왼쪽 부분리스트의 시작점
        int r = mid+1; // 오른쪽 부분리스트의 시작점
        int idx = left; // 채워넣을 배열의 인덱스

        while (l<= mid && r<=right){
            if (a[l] <= a[r]){
                sorted[idx++] = a[l++];
            }else {
                sorted[idx++] = a[r++];
            }
        }
        while (l<=mid){
            sorted[idx++] = a[l++];
        }
        while (r<=mid){
            sorted[idx++] = a[r++];
        }

        for (int i= left; i<=right; i++){
            a[i] = sorted[i];
        }
    }
    private static void out_put(int arr[]){
        for (int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
