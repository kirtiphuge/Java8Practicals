package com.learnJava.methodReference;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDatabase;

import java.util.function.Predicate;

public class RefactorLambdaToMethodReference {
    static Predicate<Student> p1 = (student) -> student.getGradeLevel() >= 3;
    static Predicate<Student> p2 = RefactorLambdaToMethodReference::getGradeLevel;

    public static boolean getGradeLevel(Student student){
        return student.getGradeLevel() >= 3;
    }
    public static void main(String[] args) {
        System.out.println(p1.test(StudentDatabase.supplier.get()));
        System.out.println(p2.test(StudentDatabase.supplier.get()));
    }
}
