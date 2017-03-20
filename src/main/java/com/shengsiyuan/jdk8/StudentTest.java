package com.shengsiyuan.jdk8;

import java.util.function.Supplier;

/**
 * Created by sundalei on 17-2-21.
 */
public class StudentTest {

    public static void main(String[] args) {
        Supplier<Student> supplier = () -> new Student();
        System.out.println(supplier.get().getName());

        System.out.println("--------------------");

        Supplier<Student> supplier2 = Student::new;
        System.out.println(supplier2.get().getName());
    }
}
