package com.company.study.structure05_method_;

public class Term2 {
    public int coef;
    public int expo;

    public int calcTerm(int x) {

        return (int)( coef * Math.pow(x,expo));
    }

    public void printTerm() {

        System.out.print(coef+"x"+expo);
    }

}
