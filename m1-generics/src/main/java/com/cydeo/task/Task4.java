package com.cydeo.task;

import java.util.List;

public class Task4 {


    public static void print(List<? extends Number> list) {
        for (Number n : list)
            System.out.print(n + " ");
        System.out.println();
    }


    //we write "Number" we must to know our generic type support number. because of this this gives us compile.


    }
