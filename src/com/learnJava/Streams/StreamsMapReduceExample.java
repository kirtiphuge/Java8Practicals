package com.learnJava.Streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDatabase;

public class StreamsMapReduceExample {
    public static int getTotalNumberOfNotebooks(){
        return StudentDatabase.getAllStudents()
                .stream()
                .filter((student -> student.getGpa()>=3))
                .filter((student -> student.getGender().equals("female")))
                .map(Student::getNoOfNotebooks)
                //.reduce(0, (a,b) -> a+b);

                .reduce(0,Integer::sum);
    }
    public static void main(String[] args) {
        System.out.println(getTotalNumberOfNotebooks());
    }
}
