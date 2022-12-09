package com.learnJava.Streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {

    public static List<Student> sortStudentsByStudentName(){
        return StudentDatabase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName)) //Customised sorting based on Name
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentsByStudentGPA(){
        return StudentDatabase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa)) //Customised sorting based on GPA
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentsByStudentGPADesc(){
        return StudentDatabase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed()) //Customised sorting based on GPA desc
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("Students sorted by Name : ");
        sortStudentsByStudentName().forEach(System.out::println);
        System.out.println("Students sorted by GPA : ");
        sortStudentsByStudentGPA().forEach(System.out::println);
        System.out.println("Students sorted by GPA descending order");
        sortStudentsByStudentGPADesc().forEach(System.out::println);
    }
}
