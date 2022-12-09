package com.learnJava.Streams;

import com.learnJava.data.StudentDatabase;

public class StreamsMatchExample {
    public static boolean anyMatchExample(){
        return StudentDatabase.getAllStudents().stream()
                .anyMatch(student -> student.getGpa() >=3.5);
    }

    public static boolean allMatchExample(){
        return StudentDatabase.getAllStudents().stream()
                .allMatch(student -> student.getGpa() >=3.5);
    }

    public static boolean noneMatchExample(){
        return StudentDatabase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa() >=4.1);
    }

    public static void main(String[] args) {
        System.out.println("Any Match : " +anyMatchExample());
        System.out.println("All Match : "+allMatchExample());
        System.out.println("None Match : "+noneMatchExample());
    }
}
