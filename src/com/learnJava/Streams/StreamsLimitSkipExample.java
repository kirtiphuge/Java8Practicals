package com.learnJava.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamsLimitSkipExample {
    public static List<Integer> inputList = Arrays.asList(6,7,8,9,10);
    public static Optional<Integer> limit(List<Integer> input){
        return input.stream()
                .limit(2) // 6,7
                .reduce((a,b) -> a+b);
    }

    public static Optional<Integer> skip(List<Integer> input){
        return input.stream()
                .skip(2) // 8,9,10
                .reduce((a,b) -> a+b);
    }

    public static void main(String[] args) {
        Optional<Integer> limit = limit(inputList);
        if(limit.isPresent())
            System.out.println(limit.get());
        else
            System.out.println("Empty value");

        Optional<Integer> skip = skip(inputList);
        if(skip.isPresent())
            System.out.println(skip.get());
        else
            System.out.println("Empty value");
    }
}
