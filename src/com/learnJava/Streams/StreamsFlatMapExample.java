package com.learnJava.Streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDatabase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsFlatMapExample {
    public static List<String> printStudentActivities(){
        return StudentDatabase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(toList());
    }

    public static List<String> printDistinctStudentActivities(){
        return StudentDatabase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .collect(toList());
    }

    public static long printStudentActivitiesCount(){
        return StudentDatabase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();
    }

    public static List<String> printDistinctAndSortedStudentActivities(){
        return StudentDatabase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(toList());
    }

    public static void main(String[] args) {
        System.out.println(printStudentActivities());
        System.out.println(printDistinctStudentActivities());
        System.out.println(printStudentActivitiesCount());
        System.out.println(printDistinctAndSortedStudentActivities());
    }
}
