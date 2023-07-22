package com.cydeo.review_LAMBD;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Mike", 101));
       studentList.add(new Student("Joe", 102));
        studentList.add(new Student("Adam", 103));


        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(new Teacher("Albus", 201));
        teacherList.add(new Teacher("Severus", 202));

      //  printInfo(studentList);
     //   printInfo(teacherList);

        // System.out.println(getLastItem(studentList));
//  System.out.println(getLastItem(teacherList));

        MyUtils<Student> obj1 = new MyUtils<>();
        obj1.printInfo2(studentList);
        System.out.println(obj1.getLastItem(studentList));

        MyUtils<Teacher> obj2 = new MyUtils<>();
        obj2.printInfo2(teacherList);
        System.out.println(obj2.getLastItem(teacherList));


       // MyUtils <String> obj3 = new MyUtils<>();
        //we can not use this.


    }
    //write a method that takes a list of students, prints each student and the total students count

    public static <T> void printInfo(List<T> personList) {
        for (T person : personList) {
            System.out.println(person);
        }
        System.out.println(personList.size());
    }

    public static void printInfo2(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println(students.size());
    }


    public static <T> T getLastItem(List<T> list) {
        return list.get(list.size() - 1);
    }


}
