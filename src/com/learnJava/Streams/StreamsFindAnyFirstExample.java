package com.learnJava.Streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDatabase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {
    public static Optional<Student> findAnyStudent(){
        return StudentDatabase.getAllStudents().stream()
                //adam
                //jenny
                //emily
                .filter(student -> student.getGpa() > 3.9)
                .findAny();  // all the elements in the stream are not processed. When the first element is found which
                             // qualifies the filter that element is returned and further elements are not processed
    }

    public static Optional<Student> findFirstStudent(){
        return StudentDatabase.getAllStudents().stream()
                //adam
                //jenny
                //emily
                .filter(student -> student.getGpa() > 3.9)
                .findFirst();  // all the elements in the stream are not processed. When the first element is found which
        // qualifies the filter that element is returned and further elements are not processed
    }

    public static void main(String[] args) {
        //These 2 methods use the concept of short circuiting
        //short circiting means the entire stream is not processed.Only the required elements are processed
        System.out.println(findAnyStudent());
        System.out.println(findFirstStudent());
    }
}
