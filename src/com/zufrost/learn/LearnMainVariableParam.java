package com.zufrost.learn;

public class LearnMainVariableParam {
    public static void main(String[] args) {
        VariableParam param = new VariableParam();
//        param.method(42, 3, 5);
//        param.method();
        int [] arr = {4, 5};
        param.method(arr);
        param.method(1, 42);
    }

}
