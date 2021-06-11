package com.company.study.algorithm.lesson02_sort.chap02;

public class MergeSort {

    static void merge(int data[], int p , int q , int r){
        int i =p , j = q +1 , k = p;
        int tmp[data.length];
        while (i<=q && j<=r){
            if (data[i] <= data[j]){
                tmp[k++] = data[i++];
            }else {
                tmp[k++] = data[j++];
            }
        }
        while (i<=q){
            tmp[k++] = data[i++];
        }
        while (j<=r){
            tmp[k++] = data[j++];
        }
        for (int m = p; m<=r; i++){
            data[m] = tmp[m];
        }
    }
    public static void main(String[] args) {
        int data[] = {1,2,10,3,4,9,19,30,21,43,56,2};

    }
}
