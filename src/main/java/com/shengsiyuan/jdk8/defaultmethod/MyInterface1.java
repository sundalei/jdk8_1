package com.shengsiyuan.jdk8.defaultmethod;

/**
 * Created by sundalei on 17-2-22.
 */
public interface MyInterface1 {

    default void myMethod() {
        System.out.println("MyInterface1");
    }
}
