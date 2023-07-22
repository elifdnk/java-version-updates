package com.cydeo.task;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {
    public static Stream<Employee> readAll(){
        return Stream.of(

                new Employee(100,"mike","mike@cydeo.com", Arrays.asList("201","202")),
                new Employee(101,"Ozzy","ozzy@cydeo.com",Arrays.asList("2548","2542")),
                new Employee(102,"Peter","peter@cydeo.com",Arrays.asList("5487","5689"))

        );
    }
}
