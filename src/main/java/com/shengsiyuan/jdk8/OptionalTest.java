package com.shengsiyuan.jdk8;

import java.util.Optional;

/**
 * Created by sundalei on 17-2-21.
 */
public class OptionalTest {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("hello");

        optional.ifPresent(item -> System.out.println(item));
        System.out.println("-----------------");
        System.out.println(optional.orElse("world"));
        System.out.println("-----------------");
        System.out.println(optional.orElseGet(() -> "nihao"));
    }
}
