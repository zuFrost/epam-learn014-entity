package com.zufrost.learn;

class Quest {
    private void show(int i){
        System.out.println("1");
    }
}
class Example extends Quest{
    public void show(int i){
        System.out.println("2");
    }
    public static void main(String[] args){
        Quest quest = new Example();
        int i = '1'; //1
//        quest.show(i);
    }
}
