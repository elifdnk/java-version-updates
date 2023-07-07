package com.cydeo.task;

public class Task5 {

 //   Given the following classes:
    class Shape { /* ... */ }
    class Circle extends Shape { /* ... */ }
    class Rectangle extends Shape { /* ... */ }
    class Node<T> { /* ... */ }

  //  Will the following code compile? If not, why?
    Node<Circle> nc = new Node<>();
   // Node<Shape> ns = nc; //compile

    //nc is Circle. can not accept Shape.







}
