package com.mj.source;

public class Arithmetic 
{
    public static void main(String[] args) {
        Arithmetic arth = new Arithmetic();
        System.out.println("Sum is :"+arth.add(14,16));
    }
 public int add(int a, int b) {
        return a + b;
    }
}
