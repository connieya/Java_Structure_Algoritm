package com.company.study.structure01_array;

import java.util.Scanner;

public class Code09 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] data = new int[n];

        for(int i=0; i<n; i++)
            data[i] = kb.nextInt();
        kb.close();

        for(int i= n-1; i>0; i--)
            for (int j=0; j<i; j++){
                if(data[j] > data[j+1]){
                    int temp = data[j+1];
                    data[j+1] = data[j];
                    data[j] = temp;
                }

            }

        System.out.println("sort data");

            for (int i=0; i<n; i++)
                System.out.print(data[i]+ " ");


    }
}
