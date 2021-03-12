package com.company.study.structure01_array;

public class Code05 {

    public static void main(String[] args) {

//        int n = 12;

        // 2, 3, 4, 5 .... n/2
        // n의 약수가 n/2보다 클수 없다  => 10의 약수가 5보다 클 수 없다.

        // 2 ~ 100000 중에 솟수 찾기
        for (int n = 2; n <= 1000; n++) {

            boolean isPrime = true;
            for (int i = 2; i <= n / 2 && isPrime; i++) {
                if (n % i == 0) {
                    isPrime = false;
//                break;  break 대신에 isPrime 을 조건에 넣어도된다.
                }
            }
            if (isPrime)
            System.out.println("솟수만 출력 "+n);
        }
    }
}
