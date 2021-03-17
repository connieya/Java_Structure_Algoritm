package com.company.study.structure02_method;

import java.util.Scanner;

public class Code13_2 {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int i = kb.nextInt();

        int  [] data = new int [i];

        for (int k=0; k<i; k++)
            data[k] = kb.nextInt();

        kb.close();

        bubbleSort(data);

        System.out.println("Sorted data");

        for (int k=0; k< i; k++)
            System.out.print(data[k] + "  ");

    }

    private static void bubbleSort(int []data) {

        for (int i= data.length-1; i>0; i--){
            for (int j=0; j<i; j++){
                if (data[j]>data[j+1]){

                    swap(data[j], data[j+1]);
                }
            }
        }

    }
    private static void swap(int datum, int datum1) {
               int tmp = datum1;
                datum1=datum;
                datum = tmp;
    }

}
// 값에 의한 호출

