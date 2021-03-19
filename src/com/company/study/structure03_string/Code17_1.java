package com.company.study.structure03_string;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code17_1 {

    static String [] names = new String[1000];
    static int numbers [] = new int[1000];
    static int n = 0;

    public static void main(String[] args) {

        try {
            Scanner inFile = new Scanner(new File("input.txt"));

            while (inFile.hasNext()){
                names[n] = inFile.next();
                numbers[n] = inFile.nextInt();
                n++;
            }
            inFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        bublleSort();
        
        for (int i=0; i<n; i++){
            System.out.println("name : " +names[i]+", number : "+numbers[i]);
        }


    }

    private static void bublleSort() {

        for (int i=n-1; i>0; i--)
            for (int j=0; j<i; j++){
                if (names[j].compareTo(names[j+1]) > 0){
                    String tmp = names[j+1];
                    names[j+1] = names[j];
                   names[j] =tmp;

                    int tmp1 = numbers[j+1];
                    numbers[j+1] = numbers[j];
                  numbers[j] = tmp1;
                }
            }
    }
}
