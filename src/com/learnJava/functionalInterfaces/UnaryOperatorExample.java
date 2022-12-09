package com.learnJava.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    //input and output both are of type String
    static UnaryOperator<String> unary = (str) -> str.concat("default");

    public static void main(String[] args) {
        System.out.println(unary.apply("java8"));
    }
}
