package com.company.study.structure02_method;

import java.util.Scanner;

public class Code13 {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int i = kb.nextInt();

        int  [] data = new int [i];

        for (int k=0; k<i; k++)
            data[k] = kb.nextInt();

        kb.close();

        bubbleSort(data);

        System.out.println("sorted data");
        for (int k=0; k< data.length; k++)
            System.out.print(data[k] + "  ");

    }

    private static void bubbleSort(int []data) {

        for (int i= data.length-1; i>0; i--){
            for (int j=0; j<i; j++){
                int tmp;
                if (data[j]>data[j+1]){
                    tmp = data[j+1];
                    data[j+1]=data[j];
                    data[j] = tmp;
                }
            }
        }

    }

}
