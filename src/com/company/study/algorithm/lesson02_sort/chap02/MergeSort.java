package com.company.study.algorithm.lesson02_sort.chap02;

public class MergeSort {

    private static void merge(int data[], int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;
        int tmp[] = new int[data.length];
        while (i <= mid && j <= right) {
            if (data[i] < data[j]) {
                tmp[k++] = data[i++];
            } else {
                tmp[k++] = data[j++];
            }
        }
        while (i <= mid) {
            tmp[k++] = data[i++];
        }
        while (j <= right) {
            tmp[k++] = data[j++];
        }
        for (int m = left; m < k; m++) {
            data[m] = tmp[m];
        }
    }

    public static void main(String[] args) {
        int data[] = {1, 2, 10, 3, 4, 9, 19, 30, 21, 43, 56, 2};
        out_put(data);
        merge_sort(data, 0, data.length-1);
        out_put(data);

    }

    private static void merge_sort(int arr[], int left, int right) {

        if (left < right) {
            int mid = (left + right) / 2;
            merge_sort(arr, left, mid);

            merge_sort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }

    }

    private static void out_put(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
