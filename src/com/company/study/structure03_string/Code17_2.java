package com.company.study.structure03_string;

import java.util.Scanner;

public class Code17_2 {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int n = sc.nextInt();
        int data[] = new int[n];

        for (int i =0; i< n; i++){
            data[i] =  sc.nextInt();

        }
        sc.close();

        for (int t = n-1; t >0; t--){
            for (int j =0; j<t; j++){
                if (data[j]>data[j+1]){
                    int tmp = data[j+1];
                    data[j+1] = data[j];
                    data[j] = tmp;
                }
            }

        }

        for (int k =0; k<n; k++){
            System.out.print(data[k] + "  ");
        }

    }


}
