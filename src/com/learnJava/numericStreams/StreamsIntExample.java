package com.learnJava.numericStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamsIntExample {
    public static int sumOfNIntegers(List<Integer> inputList){
        // this will have to convert each Integer into its primitive type. <Integer> is a wrapper class
        return inputList.stream().reduce(0, (x,y)->x+y);
    }

    public static int sumOfNIntegersUsingIntStream(List<Integer> inputList){
        // this will directly create stream of integers and no need of conversion
        return IntStream.rangeClosed(1,6).sum();
    }
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);

        System.out.println("Sum of N numbers using wrapper class : " +sumOfNIntegers(integerList));

        System.out.println("Sum of N numbers using Int Stream  : " +sumOfNIntegersUsingIntStream(integerList));

    }
}
