package com.shengsiyuan.jdk8;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * Created by sundalei on 17-2-21.
 */
public class BinaryOperatorTest {

    public static void main(String[] args) {
        BinaryOperatorTest binaryOperatorTest = new BinaryOperatorTest();

        System.out.println(binaryOperatorTest.compute(1, 2, (a, b) -> a + b));
        System.out.println(binaryOperatorTest.compute(1, 2, (a, b) -> a - b));

        System.out.println("--------------------------");

        System.out.println(binaryOperatorTest.getShort("hello123", "world", (a, b) -> a.length() - b.length()));
        System.out.println(binaryOperatorTest.getShort("hello123", "world", (a, b) -> a.compareTo(b)));
    }

    public Integer compute(Integer a, Integer b, BinaryOperator<Integer> binaryOperator) {
        return binaryOperator.apply(a, b);
    }

    public String getShort(String a, String b, Comparator<String> comparator) {
        return BinaryOperator.minBy(comparator).apply(a, b);
    }
}
