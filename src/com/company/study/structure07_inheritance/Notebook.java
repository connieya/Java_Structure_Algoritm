package com.company.study.structure07_inheritance;

public class Notebook extends Computer{

    public double screenSize;
    public double weight;

    public Notebook(String man, String proc, int ram, int disk, double speed, double screen, double weight){

        manufacturer = man;
        processor = proc;
        ramSize = ram;
        diskSize = disk;
        processorSpeed = speed;
        screenSize = screen;
        this.weight = weight;

    }

    public Notebook() {
    }

    public static void main(String[] args) {
        Notebook test = new Notebook();
        test.manufacturer = "Dell";
        test.processor ="15";
        test.ramSize = 4;
        test.diskSize = 1000;
        test.processorSpeed = 3.2;

        test.screenSize = 15.6;
        test.weight = 1.2;

        Notebook test1 =new Notebook();
        System.out.println(test.computerPower());
    }
}
