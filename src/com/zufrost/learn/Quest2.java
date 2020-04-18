package com.zufrost.learn;

public class Quest2{
    public void method(Number obj) {
        System.out.print ("1");
    }
    public void method(Character obj) {
        System.out.print ("2");
    }
    private static void method(Integer obj) {
        System.out.print ("3");
    }
    public void method(int i) {
        System.out.print ("4");
    }
    public void method(double d) {
        System.out.print ("5");
    }
    public static void main(String [] args) {
        Quest2 quest = new Quest2();
        Number n = 67;
        Integer i = 78;
        quest.method(n);
        quest.method(i);
    }
}
