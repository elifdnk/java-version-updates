package com.cydeo.review;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Mike",101));
        studentList.add(new Student("Joe",102));
        studentList.add(new Student("Adam",103));


        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(new Teacher("Albus",201));
        teacherList.add(new Teacher("Severus",202));

        printInfo(studentList);
        printInfo(teacherList);


    }
    //write a method that takes a list of students, prints each student and the total students count

    public static <T> void printInfo (List<T> personList ){
        for (T person : personList ){
            System.out.println(person);
        }
        System.out.println(personList.size());
    }

public static void printInfo2 (List<Student> students){
    for (Student student :students){
        System.out.println(student);
    }
    System.out.println(students.size());
}


}
