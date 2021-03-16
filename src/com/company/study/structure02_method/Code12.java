package com.company.study.structure02_method;

public class Code12 {

    public static void main(String[] args) {
        for (int n =2; n<100; n++) {
            if(isPrime(n))
                System.out.println(n);
        }
    }

    static boolean isPrime(int n){

        if (n<2) return false;
        for (int i=2; i*i<=n; i++)
            if(n % i ==0){
                return false;
            }


        return true;



    }
}
