package com.cydeo.review_LAMBD;

public class CarNewPredicate implements CarPredicate{

    public boolean test (Car car){
        return car.getYear() >2015;
    }
}
