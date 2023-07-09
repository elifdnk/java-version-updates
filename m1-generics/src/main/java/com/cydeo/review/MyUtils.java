package com.cydeo.review;

import java.util.List;

public class MyUtils <T extends Person>{  //Generic Class

    public void printInfo2(List<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
        System.out.println(list.size());
    }


    public T getLastItem(List<T> list) {
        return list.get(list.size() - 1);
    }






}
