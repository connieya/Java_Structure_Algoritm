package com.company.study.structure01_array;

public class Code01_2 {

    public static void main(String[] args) {

        int array[] = new int[]{100,96,72,90,86};
        int rank = 1;

        for (int i=0; i<array.length; i++){
            for (int j =0; j<array.length; j++){
                if (array[i]<array[j]){
                    rank++;
                }
            }
            array[i] =rank;
            rank = 1;
        }


        for (int x : array){
            System.out.print(x +" ");
        }
    }
}
