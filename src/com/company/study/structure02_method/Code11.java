package com.company.study.structure02_method;

import java.util.Scanner;

public class Code11 {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = power(a ,b);

        System.out.println(result);
        sc.close();
    }


    static int power(int a, int b){

        int prod = 1;
        for(int i=0; i<b; i++){
            prod = prod*a;
        }
        return prod;

    }
}
