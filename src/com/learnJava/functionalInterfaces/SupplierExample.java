package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;

import java.util.Arrays;
import java.util.function.Supplier;

public class SupplierExample {

    static Supplier<Student> supplier = () -> {
        return new Student("Adam",2,3.6, "male", Arrays.asList("swimming", "basketball","volleyball"), 7);
    };

    public static void main(String[] args) {
        System.out.println(supplier.get());
    }
}
