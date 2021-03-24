package com.company.study.structure05_method_;

import com.company.study.structure04_2_class_object.MyPoint;
import com.company.study.structure04_2_class_object.MyRectangle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code09 {

    static MyRectangle2[] rects = new MyRectangle2[1000];  // 배열 참조변수
    static int n = 0;

    public static void main(String[] args) {

        try {
            Scanner in = new Scanner(new File("data2.txt"));

            while (in.hasNext()) {

                rects[n] = new MyRectangle2(in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt()); // 객체 참조변수
                n++;
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("No data file");
            System.exit(1);
        }


        bubbleSort();

        for (int i=0; i<n; i++){
            System.out.println(rects[i].toString());
        }

    }

    private static void bubbleSort() {

        for (int i=n-1; i>0; i--){
            for (int j=0; j<i; j++){
                if(rects[j].calcArea() > rects[j+1].calcArea()){
                    MyRectangle2 tmp = rects[j];
                    rects[j] = rects[j+1];
                    rects[j+1] = tmp;
                }
            }
        }
    }

}
