package com.company.study.structure04_2_class_object;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code03 {

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


            }

            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("No data file");
        }

        bubbleSort();
        
        for (int i=0; i<n; i++){
            System.out.println(members[i].name + " " +members[i].number);
        }

    }

    private static void bubbleSort() {

        for (int i =n-1; i>0; i--){
            for (int j = 0; j<i; j++){
                if (members[j].name.compareTo(members[j+1].name) >0){

//                    String tmp = members[j+1].name;
//                    members[j+1].name = members[j].name;
//                    members[j].name = tmp;
//
//
//                    String tmp1 = members[j+1].number;
//                    members[j+1].number = members[j].number;
//                    members[j].number = tmp;

                    Person1 tmp = members[j];
                    members[j] = members[j+1];
                    members[j+1] = tmp;



                }
            }

        }
    }
}
