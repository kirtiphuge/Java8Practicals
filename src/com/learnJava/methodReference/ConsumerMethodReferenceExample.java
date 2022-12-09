package com.learnJava.methodReference;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDatabase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {
    //Using Lambda
   static Consumer<Student> student = (student) -> System.out.println(student);

   //Using method reference ClassName:: methodName
    static Consumer<Student> student1= System.out::println;

    static Consumer<Student> student2 = Student::printStudentActivities;
    public static void main(String[] args) {
        StudentDatabase.getAllStudents().forEach(student);
        StudentDatabase.getAllStudents().forEach(student1);
        StudentDatabase.getAllStudents().forEach(student2);
    }
}
