package com.company.study.structure.lesson08_scheduler.chap01;

public class DurationEvent extends Event {
    public MyDate begin;
    public MyDate end;

    public DurationEvent(String title, MyDate begin, MyDate end) {
        super(title);
        this.begin = begin;
        this.end = end;
    }

    @Override
    public String toString() {
        return title + "," + begin.toString() + "-" + end.toString();
    }
}
