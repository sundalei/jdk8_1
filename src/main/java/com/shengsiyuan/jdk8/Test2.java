package com.shengsiyuan.jdk8;

/**
 * Created by sundalei on 17-2-18.
 */
@FunctionalInterface
interface MyInterface {

    void test();

    String toString();
}

public class Test2 {

    public void myTest(MyInterface myInterface){
        System.out.println(1);
        myInterface.test();
        System.out.println(2);
    }

    public static void main(String[] args) {
        Test2 test = new Test2();

        test.myTest(() -> {
            System.out.println("myTest");
        });

        System.out.println("---------------------------");

        MyInterface myInterface = () -> {
            System.out.println("hello");
        };

        System.out.println(myInterface.getClass());
        System.out.println(myInterface.getClass().getSuperclass());
        System.out.println(myInterface.getClass().getInterfaces()[0]);
    }

}
