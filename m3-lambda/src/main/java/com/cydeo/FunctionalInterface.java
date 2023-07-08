package com.cydeo;

import com.cydeo.behavior_parameterization.Apple;
import com.cydeo.behavior_parameterization.ApplePredicate;

import java.util.function.*;

public class FunctionalInterface {
    public static void main(String[] args) {

        ApplePredicate ap = new ApplePredicate() { //AppleHeavyPredicate class
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight()>200;
            }
        };

        //--------------------------

        System.out.println("------------   PREDICATE   --------------");

        Predicate<Integer> lesserThan = i -> i <18 ;
        System.out.println(lesserThan.test(20));

        System.out.println("-----------   CONSUMER  -----------------");

        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(5);

        System.out.println("-----------  Bİ CONSUMER  -----------------");

        BiConsumer<Integer,Integer> addTwo = (x,y) ->System.out.println(x+y);
        addTwo.accept(7,8);

        System.out.println("-----------  FUNCTION  -----------------");

        Function<String,String> fun = s -> "Hello " +s ;
        System.out.println(fun.apply("Cydeo"));

        System.out.println("-----------  Bi FUNCTION  -----------------");

        BiFunction <Integer,Integer,Integer> func = (x,y) -> x+y ;
        System.out.println(func.apply(2,3));

        System.out.println("-----------  SUPPLIER  -----------------");

        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());



    }
}
