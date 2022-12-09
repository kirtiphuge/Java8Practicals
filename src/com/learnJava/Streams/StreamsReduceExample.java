package com.learnJava.Streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDatabase;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduceExample {
    public static List<Integer> intergerList = Arrays.asList(1,3,5,7);

    public static List<Integer> intergerList1 = new ArrayList<>();
    public static Integer performMultiplicationWithIdentity(List<Integer> integerList){
        return integerList.stream()
                //1
                //3
                //5
                //7
                // 1st iteration - a=1 (identity) b=1 . Result - 1
                //2nd iteration - a=result from previous step (1), b=3. Result = 3
                //3rd iteration - a=result from previous step (3), b=5. Result = 15
                //4th iteration - a=result from previous step (15), b=7. Result = 105
                .reduce(1, (a,b) -> a*b);
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList){
        return integerList.stream()
                //1
                //3
                //5
                //7
                // 1st iteration - a=1 (identity) b=1 . Result - 1
                //2nd iteration - a=result from previous step (1), b=3. Result = 3
                //3rd iteration - a=result from previous step (3), b=5. Result = 15
                //4th iteration - a=result from previous step (15), b=7. Result = 105
                .reduce((a,b) -> a*b);
    }

    public static Optional<Student> getStudentWithHighestGPA(){
        return StudentDatabase.getAllStudents().stream()
                .reduce((s1,s2) ->s1.getGpa()>s2.getGpa() ? s1 : s2);
    }

    public static void main(String[] args) {
        System.out.println(performMultiplicationWithIdentity(intergerList));
        System.out.println(performMultiplicationWithoutIdentity(intergerList).isPresent());
        System.out.println(performMultiplicationWithoutIdentity(intergerList).get());
        //If an empty list is passed and if we perform get() then an exception is thrown
        /*System.out.println(performMultiplicationWithoutIdentity(intergerList1).isPresent());
        System.out.println(performMultiplicationWithoutIdentity(intergerList1).get()); */

        Optional<Student> studentOptional = getStudentWithHighestGPA();
        if(studentOptional.isPresent()){
            System.out.println(studentOptional.get());
        }
    }
}
