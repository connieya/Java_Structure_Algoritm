package com.company.study.structure01_array;

import java.util.Scanner;

public class Code01 {

    int num;

    public void calc(){
        num =5;
    }
    public static void main(String[] args) {



        String str = "hello";

        String input = null;

        Scanner kn = new Scanner(System.in);

        System.out.println("please type");

        input = kn.next();

        if(str.equals(input)){
            System.out.println("match");
        }else{
            System.out.println("not match");
        }
    }
}
