package com.learnJava.numericStreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangesExample {
    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1,50);
        System.out.println("Int Range count : " + intStream.count());

        IntStream.range(1,50).forEach(value -> System.out.print(value + "," ));

        System.out.println("Int Rangeclosed count : " + IntStream.rangeClosed(1,50).count());
        IntStream.rangeClosed(1,50).forEach(value -> System.out.print(value + "," ));

        System.out.println("Long Range count : " + LongStream.range(1,50).count());

        LongStream.range(1,50).forEach(value -> System.out.print(value + "," ));

        System.out.println("Long Rangeclosed count : " + LongStream.rangeClosed(1,50).count());
        LongStream.rangeClosed(1,50).forEach(value -> System.out.print(value + "," ));

        //Double stream
        LongStream.range(1,50).asDoubleStream();
    }
}
