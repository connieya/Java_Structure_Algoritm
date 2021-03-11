package com.company.study.structure01_array;

import java.util.Scanner;

public class Code03 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("배열의 크기와 숫자를 입력하세요");
        int num = kb.nextInt();
        int [] data = new int [num];
        for (int i=0; i<num; i++){
            data[i] = kb.nextInt();
        }
        kb.close();

//        int max= 0;
        int max = data[0];
        for(int i=0; i<num; i++){

            if(data[i] > max){
                max = data[i];
            }
        }

//        int min = 99;
        int min = data[0];
        for (int i =0; i<num; i++){
            if(data[i] < min){
                min = data[i];
            }

        }

        System.out.println("max = "+max);
        System.out.println("min =" +min);

        // 리팩토링  => 만약에 입력한 값이 음수 이면 max값이 출력되지 않는다.



    }
}
