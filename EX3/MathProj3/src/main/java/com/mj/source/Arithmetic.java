package com.mj.source;

public class Arithmetic 
{
    public static void main(String[] args) {
        Arithmetic arth = new Arithmetic();
        System.out.println("Sum is :" + arth.add(14, 16));
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Mysql Driver class loaded");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
 public int add(int a, int b) {
        return a + b;
    }
}
