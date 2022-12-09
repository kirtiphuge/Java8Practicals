package com.learnJava.Streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterExample {
    public static List<Student> filterStudents(){
        return StudentDatabase.getAllStudents().stream()
                .filter((Student -> Student.getGender().equals("female")))
                .filter((Student -> Student.getGpa() > 3.9))
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        filterStudents().forEach(System.out::println);
    }
}
