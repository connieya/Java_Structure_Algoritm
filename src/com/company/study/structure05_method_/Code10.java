package com.company.study.structure05_method_;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code10 {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("data.txt"));
            int n = in.nextInt();
            OrthoPolygon thePolugon = new OrthoPolygon(n);
            for (int i=0; i<n; i++)
                thePolugon.addVertex(new MyPoint2(in.nextInt(), in.nextInt()));

        }catch (FileNotFoundException e){
            System.out.println("No data file exists");
            System.exit(1);
        }
    }
}
