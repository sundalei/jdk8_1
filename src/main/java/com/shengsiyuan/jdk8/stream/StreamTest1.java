package com.shengsiyuan.jdk8.stream;

import java.util.stream.Stream;

/**
 * Created by sundalei on 17-2-23.
 */
public class StreamTest1 {

    public static void main(String[] args) {
        Stream stream1 = Stream.of("hello", "world", "hello world");

        String[] myArray = new String[]{"hello", "world", "hello world"};
        Stream stream2 = Stream.of(myArray);
    }
}
