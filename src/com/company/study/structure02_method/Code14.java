package com.company.study.structure02_method;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code14 {
    public static void main(String[] args) throws FileNotFoundException {

        String [] name = new String[1000];
        String [] number = new String[1000];
        int n = 0; // 사람 숫자

        Scanner inFile = new Scanner(new File("input.txt"));

        while (inFile.hasNext()){  // detect End of File
            // 계속 파일의 데이터를 탐색하다가 파일 끝까지 탐색하다보면
            // hasNext()가 false가 되기 때문에 이 while 반복문은 종료된다.
            name[n] = inFile.next();
            number[n] = inFile.next();
            n++;

        }

        inFile.close();

        for (int i=0; i<n; i++)
            System.out.println(name[i]+ " " +number[i]);
    }
}
