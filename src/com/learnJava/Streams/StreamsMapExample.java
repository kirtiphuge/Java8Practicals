package com.learnJava.Streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsMapExample {

    public static List<String> getStudentName(){
        return StudentDatabase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        System.out.println(getStudentName());
    }
}
