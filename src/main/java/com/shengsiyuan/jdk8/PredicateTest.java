package com.shengsiyuan.jdk8;

import java.util.function.Predicate;

/**
 * Created by sundalei on 17-2-20.
 */
public class PredicateTest {

    public static void main(String[] args) {
        Predicate<String> predicate = p -> p.length() > 5;
        System.out.println(predicate.test("hello1"));
    }
}
