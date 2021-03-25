package com.company.study.structure06_static_public;

public class TestTest {

    public static void main(String[] args) {
        Test test1 = new Test();

        test1.t = 10;  // Test 객체에 있는 오브젝트 멤버

        Test.s = 10;  // Test 클레스에 있는 클래스 멤버
        Test.print();

        test1.print2();
    }
}
