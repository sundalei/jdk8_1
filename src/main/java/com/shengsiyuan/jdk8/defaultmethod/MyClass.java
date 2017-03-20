package com.shengsiyuan.jdk8.defaultmethod;

/**
 * Created by sundalei on 17-2-22.
 */
public class MyClass extends MyInterface1Impl implements MyInterface2 {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.myMethod();
    }
}
