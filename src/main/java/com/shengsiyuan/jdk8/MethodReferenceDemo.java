package com.shengsiyuan.jdk8;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sundalei on 17-2-21.
 */
public class MethodReferenceDemo {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hello world");

        list.forEach(System.out::println);
    }
}
