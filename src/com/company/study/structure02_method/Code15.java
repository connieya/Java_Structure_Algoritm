package com.company.study.structure02_method;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code15 {

    static String [] name = new String[1000];
    static String [] number = new String[1000];
    static int n = 0; // 사람 숫자

    public static void main(String[] args) throws FileNotFoundException {


        Scanner inFile = new Scanner(new File("input.txt"));

        while (inFile.hasNext()){  // detect End of File
            // 계속 파일의 데이터를 탐색하다가 파일 끝까지 탐색하다보면
            // hasNext()가 false가 되기 때문에 이 while 반복문은 종료된다.
            name[n] = inFile.next();
            number[n] = inFile.next();
            n++;

        }

        inFile.close();

        bubbleSort();

        for (int i=0; i<n; i++)
            System.out.println(name[i]+ " " +number[i]);
    }

     static void bubbleSort() {
        for (int i= n-1; i>0; i--){
            for (int j=0; j<i; j++){

                if (name[j].compareTo(name[j+1]) > 0) {

                    String tmp = name[j];
                    name[j] = name[j+1];
                    name[j+1] = tmp;

                    tmp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = tmp;
                }
            }
        }
    }
}
