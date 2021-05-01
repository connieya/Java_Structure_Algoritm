package com.company.study.structure08_scheduler;

public class DeadLinedEvent extends Event{
    public String title;
    public MyDate date;

    public DeadLinedEvent(String title, MyDate date) {
       super(title);
        this.date = date;
    }

    @Override
    public String toString() {
        return title +","+date.toString();
    }
}
