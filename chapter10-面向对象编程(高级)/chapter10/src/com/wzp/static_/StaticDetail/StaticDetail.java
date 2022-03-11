package com.wzp.static_.StaticDetail;

public class StaticDetail {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(B.n1);
    }
}

class B{
    public static int n1=100;
}
