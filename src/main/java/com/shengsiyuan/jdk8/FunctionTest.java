package com.shengsiyuan.jdk8;

import java.util.function.Function;

/**
 * Created by sundalei on 17-2-19.
 */
public class FunctionTest {

    public static void main(String[] args) {
        FunctionTest test = new FunctionTest();
//        System.out.println(test.compute(1, value -> {return 2 * value;}));
//        System.out.println(test.compute(2, value -> 5 + value));
//        System.out.println(test.compute(3, value -> value * value));
//
//        System.out.println(test.convert(5, value -> String.valueOf(5 + "HelloWorld")));
        Function<Integer, Integer> function = value -> 2 * value;
        System.out.println(test.compute(1, function));
    }

    public int compute(int a, Function<Integer, Integer> function) {
        int result = function.apply(a);
        return result;
    }

    public String convert(int a, Function<Integer, String> function) {
        return function.apply(a);
    }
}
