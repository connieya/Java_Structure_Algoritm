package com.company.study.structure03_string;

import sun.util.locale.provider.JRELocaleProviderAdapter;

import java.io.*;
import java.util.Scanner;

public class Code18 {

    static String [] words = new String[100000];
    static int [] count = new int [100000]; // 각 단어의 등장 횟수
    static int n = 0;

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        while(true){

            System.out.print("$");
            String commend = kb.next();
            if (commend.equals("read")) {
                String fileName = kb.next();
                makeIndex( fileName);
            }else if(commend.equals("find")){
                String str = kb.next();
                int index = findWord(str);
                if(index > -1){
                    System.out.println("The word " + words[index]+" appears "+ count[index]+ " times");
                }
                else{
                    System.out.println("The word " + str +" does not appear");
                }

            }else if(commend.equals("saves")){
                String fileName = kb.next();
                saveAs(fileName);

            }else if(commend.equals("exit")){
                break;
            }

        }

            kb.close();

        for (int i=0; i<n; i++)
            System.out.println(words[i]+" "+ count[i]);

    }

    private static void saveAs(String fileName) {
        PrintWriter out;
        try {
            out = new PrintWriter(new FileWriter(fileName));

            for (int i=0; i<n; i++)
                out.println(words[i]+ " "+count[i]);

            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void makeIndex(String fileName) {

        try {
            Scanner inFile = new Scanner(new File(fileName));
            while (inFile.hasNext()){
                String str = inFile.next();
                
                addWord(str);
            }
            
            inFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("No file");
            return;
        }
    }

    private static void addWord(String str) {
        int index = findWord(str);
        if(index !=-1){
            count[index]++;

        }else{
            words[n] = str;
            count[n] = 1;
            n++;
        }
    }

    private static int findWord(String str) {
        for(int i=0; i<n; i++)
            if(words.equals(str))
                return i;

        return -1;
    }
}
