package com.zufrost.learn;

public class Quest3 {
    public Quest3 () {}
    public Quest3 (int i) {this (i, i);}
    public Quest3 (int i, int j) {this ();}
    public static void main (String [] args) {
        Quest3 quest = new Quest3 (2,3); // 1
    }
}