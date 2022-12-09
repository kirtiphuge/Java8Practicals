package com.learnJava.numericStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamMapExample {
    public static List<Integer> mapToObj(){
        return IntStream.rangeClosed(1,5)
                .mapToObj(value -> new Integer(value)).collect(Collectors.toList());
    }

    public static long mapToLong(){
        return IntStream.rangeClosed(1,5)
                .mapToLong(i -> i)//convert int stream to long stream
                .sum();
    }

    public static double mapToDouble(){
        return IntStream.rangeClosed(1,5)
                .mapToDouble(i -> i)//convert int stream to long stream
                .sum();
    }
    public static void main(String[] args) {
        System.out.println(mapToObj());
        System.out.println(mapToLong());
        System.out.println(mapToDouble());
    }
}
