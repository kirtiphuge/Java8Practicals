package com.learnJava.methodReference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {
    static Function<String,String> functionLambda = (s) -> s.toUpperCase();
    static Function<String,String> functionMethodReference = String::toUpperCase;
    public static void main(String[] args) {
        System.out.println(functionLambda.apply("java8"));
        System.out.println(functionMethodReference.apply("java8"));
    }
}
