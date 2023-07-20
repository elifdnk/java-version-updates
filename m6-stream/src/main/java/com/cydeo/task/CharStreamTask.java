package com.cydeo.task;

import java.util.Arrays;
import java.util.List;

public class CharStreamTask {
    public static void main(String[] args) {

        //GIVEN A LIST OF WORDS, PRINT THE NUMBER OF CHARACTERS FOR EACH WORD
        List<String> words = Arrays.asList("JAVA","APPLE","HONDA","DEVELOPER");

        words.stream()
                .map(String::length)
                .forEach(System.out::println);


    }
}
