package com.learnJava.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

    public static List<Integer> input = Arrays.asList(6,7,8,9,10);
    public static List<Integer> input1 = new ArrayList<>();
    public static int calculateMaxValue(List<Integer> inputList){
        return inputList.stream()
                //6 - y
                //7 - y
                //8 - y
                //9 -y
                //10 - y
                .reduce(0, (a,b)-> a>b ? a : b);
    }

    public static Optional<Integer> calculateMaxValueUsingOptional(List<Integer> inputList){
        return inputList.stream()
                //6 - y
                //7 - y
                //8 - y
                //9 -y
                //10 - y
                .reduce( (a,b)-> a>b ? a : b);
    }

    public static int calculateMinValue(List<Integer> inputList){
        return inputList.stream()
                //6 - y
                //7 - y
                //8 - y
                //9 -y
                //10 - y
                .reduce(0, (a,b)-> a<b ? a : b);
    }

    public static Optional<Integer> calculateMinValueUsingOptional(List<Integer> inputList){
        return inputList.stream()
                //6 - y
                //7 - y
                //8 - y
                //9 -y
                //10 - y
                .reduce( (a,b)-> a<b ? a : b);
    }

    public static void main(String[] args) {
        System.out.println("Without Using Optional");
        System.out.println(calculateMaxValue(input));
        System.out.println(calculateMaxValue(input1));

        System.out.println("Using Optional");
        System.out.println(calculateMaxValue(input));
        Optional<Integer> maxValueOptional = calculateMaxValueUsingOptional(input1);
        if(maxValueOptional.isPresent())
            System.out.println("Optional max value returned :" + maxValueOptional.get());
        else
            System.out.println("List is empty");

        System.out.println("Min value");

        System.out.println("This will return wrong value using identity. This should be never used when calculating min value");
        System.out.println(calculateMinValue(input));

        System.out.println("Using Optional");
        Optional<Integer> minVal = calculateMinValueUsingOptional(input);
        if(minVal.isPresent())
            System.out.println(calculateMinValueUsingOptional(input));
        else
            System.out.println("List is empty");


    }
}
