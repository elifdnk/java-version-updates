package com.cydeo.task;

import java.util.Arrays;
import java.util.List;

public class CountTheNumbersHaveASpecificProperty_Test {

    public static void main(String[] args) {

        List<Integer> ci = Arrays.asList(1, 2, 3, 4,5);
        int count = countIf(ci, new OddPredicate());

        System.out.println("Number of odd integers = " + count);


    }

    //why we need generic method? because now we want to odd number, later we want to find even number we change the implementations.

    private static <T> int countIf(List<T> c, UnaryPredicate<T> p) {

        int count = 0;
        for (T element : c) {
            if (p.test(element)) {
                ++count;
            }
        }
        return count;
    }


}
