package com.company.study.structure06_static_public;

public class Test {

    static int s = 0; // 클레스 멤버
    int t = 0; // 오브젝트 멤버 , 허상 (Test 객체 안에 있는 허상)

    public static void print(){
        Test tt= new Test();
        System.out.println("s = " + s);
//        System.out.println("t = " +t);
        System.out.println("t = "+tt.t);
    }

    public void print2(){ // 객체 안에 있다. print2 메서드를 외부에서 사용하려면 , 객체를 생성해야한다.
        System.out.println("s =" +s);
        System.out.println("t = "+t);
    }

    public static void main(String[] args) {
        s = 100;  // 클래스 멤버
//        t = 100;
        print(); // 클래스 멤버
//        print2();
    }
}
