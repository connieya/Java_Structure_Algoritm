package com.company.study.structure01_array;

import java.util.Scanner;

public class Code02 {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("배열의 크기와 숫자를 입력하세요");
        int num = kb.nextInt();
        int [] data = new int [num];
        for (int i=0; i<num; i++){
            data[i] = kb.nextInt();
        }
            kb.close();

        int sum= 0;
        for(int i=0; i<num; i++){
            sum += data[i];
        }

        System.out.println("sum = "+sum);
    }
}
