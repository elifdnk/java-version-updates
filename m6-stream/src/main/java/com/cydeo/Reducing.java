package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4, 5, 3, 9);

      /*  int sum =0 ;
        for (int each : numbers){
            sum +=each;
        }  */

        int result = numbers.stream().reduce(0, (a, b) -> (a + b));
        System.out.println(result);


        System.out.println("Dish calories total: ");
        int totalCaloriesDishes = DishData.getAll().stream()
                .map(Dish::getCalories)
                .reduce(Integer::sum)
                .get();
        System.out.println(totalCaloriesDishes);

        //Max and Min
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);

        System.out.println("min = " + min.get());
        System.out.println("max = " + max.get());
        System.out.println("sum = " + sum.get());


        //COUNT
        System.out.println("COUNT");
        long dishCount = DishData.getAll().stream().count();
        System.out.println(dishCount);


    }
}
