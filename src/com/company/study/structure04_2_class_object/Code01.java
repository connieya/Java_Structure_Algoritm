package com.company.study.structure04_2_class_object;

public class Code01 {

    public static void main(String[] args) {
        int x;
        x= 100;

        double y = 1.0023;

        Person1 first;
        first = new Person1();

        first.name = "john";
        first.number ="01028646022";

        int [] data;
        data = new int[100];
        data[0] = 5;

        Person1 [] members = new Person1[100];
        members[0] = first;
        members[1] = new Person1();
        members[1].name ="David";
        members[1].number = "01023112d";


    }

}
