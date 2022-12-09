package com.learnJava.Streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamsOfIterateGenerateExample {
    public static void main(String[] args) {
        //Of()
        Stream<String> input = Stream.of("Kirti","Swapnil", "Mandar");
        input.forEach(System.out::println);

        //iterate
        Stream.iterate(1,x-> x*2)
                .limit(10)
                .forEach(System.out::println);

        Supplier<Integer> supp = new Random()::nextInt;
        Stream.generate(supp).limit(10).forEach(System.out::println);
    }
}
