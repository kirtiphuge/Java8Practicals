package com.learnJava.constructorReference;

import com.learnJava.data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {
    static Supplier<Student> student = Student::new;
    static Function<String, Student> student1 = Student::new;

    public static void main(String[] args) {
        System.out.println(student.get());
        System.out.println(student1.apply("kirti"));
    }
}
