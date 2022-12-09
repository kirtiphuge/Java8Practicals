package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDatabase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = (student) -> student.getGradeLevel() >= 3;
    static Predicate<Student> p2 = (student) -> student.getGpa() >= 3.9;

    public static void filterStudentByGradeLevel(){
        System.out.println("Filter student by Grade level");
        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach(student -> {
            if(p1.test(student)){
                System.out.println(student);
            }
        });
    }

    public static void filterStudentByGpaLevel(){
        System.out.println("Filter student by GPA :");
        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach(student -> {
            if(p2.test(student)){
                System.out.println(student);
            }
        });
    }

    public static void filterStudentsByAnd(){
        System.out.println("Filter student By AND:");
        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach(student -> {
            if(p1.and(p2).test(student)){
                System.out.println(student);
            }
        });
    }

    public static void filterStudentsByOr(){
        System.out.println("Filter student By OR:");
        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach(student -> {
            if(p1.or(p2).test(student)){
                System.out.println(student);
            }
        });
    }

    public static void filterStudentsByNegate(){
        System.out.println("Filter student By Negate:");
        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach(student -> {
            if(p1.or(p2).negate().test(student)){
                System.out.println(student);
            }
        });
    }

    public static void main(String[] args) {
        filterStudentByGradeLevel();
        filterStudentByGpaLevel();
        filterStudentsByAnd();
        filterStudentsByOr();
    }
}
