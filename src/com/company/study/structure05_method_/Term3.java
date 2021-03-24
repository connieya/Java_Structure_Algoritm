package com.company.study.structure05_method_;

public class Term3 {
    public int coef;
    public int expo;

    public Term3(int c, int e) {
        this.coef = c;
        this.expo = e;
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
