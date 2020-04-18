package com.zufrost.learn;

public class Student extends Person{
    private int yearOfStudy;

     Student(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

         Student(int id, int yearOfStudy) {
//        super(id);
        this(yearOfStudy);
    }

    //
}
