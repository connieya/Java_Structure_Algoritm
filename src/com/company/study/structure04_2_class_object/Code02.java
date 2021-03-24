package com.company.study.structure04_2_class_object;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code02 {

    static Person1 [] members = new Person1[100];
    static int n = 0;

    public static void main(String[] args) {


        try {
            Scanner in = new Scanner(new File("input.txt"));
            while(in.hasNext()){
                String name = in.next();
                String number = in.next();

                members[n] = new Person1();
                members[n].name = name;
                members[n].number = number;
                n++;

                // 배열도 프리미티브 타입이 아니고, 원소인 Person1도 아니기 때문에 각각 의 원소에도
                // new 로 객체의 주소를 넣어줘야한다.
            }

            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("No data file");
        }


        for (int i=0; i<n; i++){
            System.out.println(members[i].name + " " +members[i].number);
        }

    }
}
