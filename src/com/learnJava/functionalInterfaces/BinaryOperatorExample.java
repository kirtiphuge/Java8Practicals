package com.learnJava.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    //both input and output types are integer
    static BinaryOperator<Integer> binary = (a,b) -> a*b;

    static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);

    public static void main(String[] args) {
        System.out.println(binary.apply(5,5));

        BinaryOperator<Integer> maxby = BinaryOperator.maxBy(comparator);
        System.out.println(maxby.apply(6, 5));

        BinaryOperator<Integer> minby = BinaryOperator.minBy(comparator);
        System.out.println(minby.apply(6, 5));
    }
}
