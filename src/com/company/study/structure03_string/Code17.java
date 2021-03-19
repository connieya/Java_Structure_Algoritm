package com.company.study.structure03_string;

import java.util.Scanner;

public class Code17 {

    static String [] names = new String[1000];
    static int numbers [] = new int[1000];
    static int n = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int i=0; i<k; i++) {
            names[i] = sc.next();
            numbers[i] = sc.nextInt();
        }

        sc.close();

        for (int i = 0; i<k; i++){
            System.out.println(names[i]+" ," +numbers[i]);
        }




    }
}
