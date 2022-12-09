package com.learnJava.functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> func = (name) -> name.toUpperCase();
    static Function<String, String> func1 = (name) -> name.toUpperCase().concat("deafult");
    public static void main(String[] args) {
        System.out.println(func.apply("java8"));
        System.out.println(func.andThen(func1).apply("java8")); //andThen function executes in an order
                                                                    // i.e. func will be executed first and then func1
        System.out.println(func.compose(func1).apply("java8")); //compose method will first execute the inner parameter
                                                                    // i.e. func1 and then execute func
    }
}
