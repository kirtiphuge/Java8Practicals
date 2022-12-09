package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {
    static Function<List<Student>, Map<String, Double>> studentFunction = (students -> {
        Map<String, Double> studentGpaMap = new HashMap<>();
        students.forEach(student -> {
            if(PredicateStudentExample.p1.test(student)){
                studentGpaMap.put(student.getName(), student.getGpa());
            }
        });
        return studentGpaMap;
    });

    public static void main(String[] args) {
        System.out.println(studentFunction.apply(StudentDatabase.getAllStudents()));
    }
}