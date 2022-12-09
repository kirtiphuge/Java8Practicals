package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    // Predicate has test method with 1 input parameter and has other default methods like AND, OR and NEGATE
    static Predicate<Student> p1 = student -> student.getGradeLevel() >= 3;
    static Predicate<Student> p2 = student -> student.getGpa() >= 3.9;

    // Predicate has test method with 2 input parameters and has other default methods like AND, OR and NEGATE
    BiPredicate<Integer,Double> biPredicate = (gradeLevel, gpa) -> {
        return gradeLevel >= 3 && gpa >= 3.9;
    };
    BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> {
        System.out.println("Name : " +name+ "Activities : " +activities);
    };

    Consumer<Student> student = (s -> {
        if(p1.and(p2).test(s)){
            studentBiConsumer.accept(s.getName(), s.getActivities());
        }
    });

    //Using BiPredicate Interface
    Consumer<Student> student1 = (s -> {
        if(biPredicate.test(s.getGradeLevel(), s.getGpa())){
            studentBiConsumer.accept(s.getName(), s.getActivities());
        }
    });
    public void printNameAndActivities(List<Student> studentList){
        System.out.println("By Using Predicate : ");
        studentList.forEach(student);
    }

    public void printNameAndActivitiesUsingBiPredicate(List<Student> studentList){
        System.out.println("By Using BiPredicate : ");
        studentList.forEach(student1);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDatabase.getAllStudents();
        new PredicateAndConsumerExample().printNameAndActivities(studentList);
        new PredicateAndConsumerExample().printNameAndActivitiesUsingBiPredicate(studentList);
    }
}
