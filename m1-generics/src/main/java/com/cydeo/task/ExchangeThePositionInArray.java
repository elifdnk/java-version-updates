package com.cydeo.task;

import java.util.Arrays;
import java.util.List;

public class ExchangeThePositionInArray {
    public static void main(String[] args) {

        // Write a generic method to exchange the positions of two different elements in array.

        Integer[] a = {1, 2, 3, 4};
        System.out.println(Arrays.toString(a));

        swap(a, 0, 2);
        System.out.println(Arrays.toString(a)); //[3,2,1,4]

    }

    public static <T> void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;


    }

}
