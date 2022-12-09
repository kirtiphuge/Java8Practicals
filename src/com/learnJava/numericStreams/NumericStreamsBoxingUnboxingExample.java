package com.learnJava.numericStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingUnboxingExample {
    public static List<Integer> boxing(){
        return IntStream.
                rangeClosed(1,10) // create int stream of 10 elements
                // int
                .boxed() //Integer
                .collect(Collectors.toList());
    }

    public static int unboxing(List<Integer> input){
        // Wrapper to primitive
        return input.stream()
                // Wrapper Integer values
                .mapToInt(Integer::intValue) // int value
                .sum();

    }
    public static void main(String[] args) {
        System.out.println("BOXING : "+boxing());
        List<Integer> input = boxing();
        System.out.println("UNBOXING : "+unboxing(input));
    }
}
