package com.zufrost.learn;

class Animal {
    Number defineAge() {
        System.out.println("I'm a big animal");
        return 10;
    }
}
class Dog extends Animal {
    public Integer defineAge (int age){
        System.out.println("I'm not so big");
        return 5;
    }
}
