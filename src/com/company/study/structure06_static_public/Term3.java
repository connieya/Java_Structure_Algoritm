package com.company.study.structure06_static_public;

public class Term3 {
    private int coef;
    private int expo;

    public void setCoef(int coef) {
        this.coef = coef;
    }

    public Term3(int c, int e) {
        this.coef = c;
        this.expo = e;
    }

    public int getCoef() {
        return coef;
    }

    public int getExpo() {
        return expo;
    }

    public Term3() {
    }

    public int calcTerm(int x) {

        return (int)( coef * Math.pow(x,expo));
    }

    public void printTerm() {

        System.out.print(coef+"x"+expo);
    }

}
