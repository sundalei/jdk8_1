package com.shengsiyuan.jdk8;

import java.util.function.Supplier;

/**
 * Created by sundalei on 17-2-21.
 */
public class SupplierTest {

    public static void main(String[] args) {

        Supplier<String> supplier = () -> "hello world";
        System.out.println(supplier.get());
    }
}
