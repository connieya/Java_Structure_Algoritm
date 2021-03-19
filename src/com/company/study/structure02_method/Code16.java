package com.company.study.structure02_method;

import java.io.File;
import java.util.Scanner;

public class Code16 {

    static int n;
    static int[][] grid;
    public static void main(String[] args) {

        try {
            Scanner inFile = new Scanner(new File("data.txt"));
            n = inFile.nextInt();
            grid = new int[n][n];
            for (int i=0; i<n; i++)
                for (int j=0; j<n; j++)
                    grid[i][j] = inFile.nextInt();

                inFile.close();
                
                for (int x=0; x<n; x++){
                    for (int y=0; y<n; y++){
                        for (int dir=0; dir<8; dir++){
                            for (int len=1; len<=n; len++){
                                int val = computeValue(x,y,dir,len);
                                if(val != -1 && isPrime(val))
                                    System.out.println(val);
                            }
                        }
                    }
                }
        }catch (Exception e){

        }
    }

    private static boolean isPrime(int val) {

        return true;
    }

    private static int computeValue(int x, int y, int dir, int len) {
        int value = 0;
        for (int i=0; i<len; i++){
            int digit = getDigit(x,y, dir,i);
            if(digit == -1)
                return -1;
            value = value*10 + digit;
        }
        return  value;
    }

    private static int getDigit(int x, int y, int dir, int i) {

        return 1;
    }
}
