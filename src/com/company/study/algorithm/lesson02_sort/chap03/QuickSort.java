package com.company.study.algorithm.lesson02_sort.chap03;

public class QuickSort {
    static int data[] = {31, 8, 48, 73, 11, 3, 20, 29, 65, 15};
    static int pivot = data[data.length-1];

    public static void main(String[] args) {

       Partition(data,0,data.length);
       out_put(data);
    }
    private static void Partition(int data[],int p , int r ){
        int i = p-1;
        int j =0;
        for (int k=0; k<r; k++){
            if (data[k] > pivot){
                j++;
            }else {
                i++;
                int temp = data[j];
                data[j] =data[i];
                data[i] = temp;
                j++;
            }
        }

    }
    private static void out_put(int arr[]){
        for (int x  : arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
