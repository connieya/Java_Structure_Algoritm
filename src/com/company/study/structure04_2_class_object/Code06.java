package com.company.study.structure04_2_class_object;

import java.util.Scanner;

public class Code06 {

    static Polynomial[] polys = new Polynomial[100];
    static int n = 0;

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        while (true) {
            System.out.println("$");
            String command = kb.next();
            if (command.equals("create")) {
                char name = kb.next().charAt(0);
                polys[n] = new Polynomial();
                polys[n].name = name;
                polys[n].terms = new Term[100];
                polys[n].nTerms = 0;
                n++;

            } else if (command.equals("add")) {
                char name = kb.next().charAt(0);
                int index = find(name);
                if (index == -1) {
                    System.out.println("No such polynomial exists");
                } else {
                    int c = kb.nextInt();
                    int e = kb.nextInt();
                    addTerm(polys[index], c, e);
                }

            } else if (command.equals("calc")) {
                char name = kb.next().charAt(0);
                int index =find(name);
                if (index == -1) {
                    System.out.println("No such polynomial exists");
                }else{
                    int x = kb.nextInt();
                    int result =calcPolymoial(polys[index], x);
                }

            } else if (command.equals("print")) {
                char name = kb.next().charAt(0);
                int index =find(name);
                if (index == -1) {
                    System.out.println("No such polynomial exists");
                }else{
                    printPolynomial(polys[index]);
                }
            } else if (command.equals("exit"))
                break;
        }
        kb.close();
    }

    private static int calcPolymoial(Polynomial p, int x) {
        int result = 0;
        for (int i=0; i<p.nTerms; i++)
            result += calcTerm(p.terms[i],x);

        return result;

    }

    private static int calcTerm(Term term, int x) {
        return (int)( term.coef * Math.pow(x,term.expo));
    }

    private static void printPolynomial(Polynomial p) {

        for(int i=0; i<p.nTerms; i++){
            printTerm(p.terms[i]);
            System.out.print("+");
        }
    }

    private static void printTerm(Term term) {

        System.out.print(term.coef+"x"+term.expo);
    }

    private static void addTerm(Polynomial poly, int c, int e) {
        int index = findTerm(poly, e);
        if (index != -1){
            poly.terms[index].coef +=c;
        }else {
            int i = poly.nTerms -1;
            while (i>=0 && poly.terms[i].expo < e){
                poly.terms[i+1] = poly.terms[i];
                i--;
            }
            poly.terms[i+1] = new Term();
            poly.terms[i+1].coef =c;
            poly.terms[i+1].expo =e;
            poly.nTerms++;
        }
    }

    private static int findTerm(Polynomial poly, int e) {
        for (int i = 0; i < poly.nTerms && poly.terms[i].expo >= 0; i++)
            if (poly.terms[i].expo == e)
                return i;


        return -1;
    }

    private static int find(char name) {
        for (int i = 0; i < n; i++)
            if (polys[i].name == name)
                return i;

        return -1;
    }

}
