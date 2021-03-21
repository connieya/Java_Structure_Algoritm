package com.company.study.structure03_string;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Code19 {

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

                String trimmed = trimming(str);
                if (trimmed != null)

                    addWord(trimmed);
            }
            
            inFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("No file");
            return;
        }
    }

    private static String trimming(String str) {


        int i = 0 , j= str.length()-1;
        while (i<=str.length()-1 && !Character.isLetter(str.charAt(i))){
            i++;
        }
        while (j >=0 && !Character.isLetter(str.charAt(j))){
            j--;
        }

        if(i>j)
            return null;
       return str.substring(i,j+1);
    }

    private static void addWord(String str) {
        int index = findWord(str);
        if(index !=-1){
            count[index]++;

        }else{

            int i = n-1;
            while (i>=0 && words[i].compareTo(str)>0){
                words[i+1] = words[i];
                count[i+1] = count[i];
                i--;
            }
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
