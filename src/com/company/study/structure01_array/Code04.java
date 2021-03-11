package com.company.study.structure01_array;

import java.util.Scanner;

public class Code04 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("배열의 크기와 숫자를 입력하세요");

        int num = kb.nextInt();

        int [] data = new int [num];

        for (int i=0; i<num; i++)
            data[i] = kb.nextInt();
        kb.close();

        // 단순이 배열이 이동하면 옆에 있는 값이 덮어진다.
        // 그렇기 때문에 이동하기 전에 옆이 값을 잠시 어디에 보관해둬야한다.
        // 배열 뒤에서 이동하면 더 편 할 수 있다.

        int temp = data[num-1]; // 배열의 제일 마지막 값

        // 배열의 제일 마지막 값 앞에서부터 배열[0]까지
       for (int i = num-2; i >=0; i--){
            data[i+1] = data[i];
        }

       data[0]  = temp;

       for(int i=0; i < num; i++){
           System.out.println(data[i]);
       }

    }

    // 강의 복습 -> Java로 배우는 자료구조 -> 제1-1장 (4/7)
}
