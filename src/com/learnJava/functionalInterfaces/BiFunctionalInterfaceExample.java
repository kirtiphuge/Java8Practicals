package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionalInterfaceExample {
    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = ((students, studentPredicate) -> {
        Map<String, Double> studentGpaMap = new HashMap<>();
        students.forEach(student -> {
            if(studentPredicate.test(student)){
                studentGpaMap.put(student.getName(), student.getGpa());
            }
        });
                return studentGpaMap;
    });

    public static void main(String[] args) {
        System.out.println(biFunction.apply(StudentDatabase.getAllStudents(), PredicateStudentExample.p1));
    }
}
