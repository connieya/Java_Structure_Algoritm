package com.company.study.structure04_2_class_object;

public class Code01_2 {

    public static void main(String[] args) {

        Person1 first;
        first = new Person1();

        first.name = "John";
        first.number = "01028646022";
        System.out.println(first.name + " " +first.number);

        Person1 second = first;
        second.name = "Tom";
        System.out.println(first.name + " " +first.number);

        Person1[] members = new Person1[100];
        members[0] =first;
        members[1] = new Person1();

        members[1].name = "David";
        members[1].number = "01023313145";
        System.out.println(members[0].name + " " + members[0].number);


        int numbers [] = new int [8];

        numbers[0] = 4;
        numbers[1] = numbers[0];

        numbers[1] = 10;

        System.out.println("numbers[0] = " + numbers[0]);

        Person1 p1 = new Person1("건희","1번");
        Person1 p2 = new Person1("건오","2번");

        Person1 [] people = new Person1[5];

        people[0] = p1;

        p2 = p1;
        people[1] = p2;

        p2.name = "박건희";

        people[2] = p2;

        System.out.println("people => " +people[0].name + " " + people[0].number);
        System.out.println("people => " +people[1].name + " " + people[1].number);
        System.out.println("people => " +people[2].name + " " + people[2].number);

        people[3] = new Person1();
        people[3].name = "코니";


    }
}
