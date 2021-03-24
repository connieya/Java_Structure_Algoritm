package com.company.study.structure04_2_class_object;

public class Person1 {

    public String name;
    public String number;


    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    public Person1(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public Person1() {
    }
}
