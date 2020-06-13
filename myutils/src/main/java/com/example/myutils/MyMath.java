package com.example.myutils;

public class MyMath {
    public static int plus(int a, int b){
        return a+b;
    }
    public static int minu(int a, int b){
        return a-b;
    }
    public static int multiple(int a, int b){
        return a*b;
    }
    public static int divide(int a, int b){
        if(b == 0)
            throw new IllegalAccessException("Divide by zero is an error");
        else
        return a/b;
    }
}
