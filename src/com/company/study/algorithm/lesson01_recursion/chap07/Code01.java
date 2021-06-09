package com.company.study.algorithm.lesson01_recursion.chap07;

public class Code01 {
    private static char data[] = {'a','b','c','d','e','f'};
    private static final int N = data.length;
    private static boolean [] include = new boolean[N];

    public static void powerSet(int k){
        if (k==N){
            for (int i=0; i<k; i++){
                if (include[i]){
                    System.out.print(data[i]+" ");
                }
            }
            System.out.println();
            return;
        }else{

            include[k] =false;
            powerSet(k+1);
            include[k] = true;
            powerSet(k+1);
        }
    }

    public static void main(String[] args) {
        powerSet(0);
    }
}
