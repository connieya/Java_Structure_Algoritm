package com.company.study.structure07_inheritance;

public class Computer {

    public String manufacturer;
    public String processor;
    public int ramSize;
    public int diskSize;
    public double processorSpeed;

    public Computer() {
    }

    public Computer(String manufacturer, String processor, int ramSize, int diskSize, double processorSpeed) {
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.diskSize = diskSize;
        this.processorSpeed = processorSpeed;
    }

    public double computerPower(){
        return ramSize * processorSpeed;
    }


    public double getProcessorSpeed() {
        return processorSpeed;
    }

    public double getRamSize() {
        return ramSize;
    }

    public int getDiskSize() {
        return diskSize;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "manufacturer='" + manufacturer + '\'' +
                ", processor='" + processor + '\'' +
                ", ramSize=" + ramSize +
                ", diskSize=" + diskSize +
                ", processorSpeed=" + processorSpeed +
                '}';
    }
}
