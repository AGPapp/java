package com.company;

public class Main {
    public static void main(String[] args) {
    int a = 1;
    int b = 2;
    int c = 3;
   b = c-- % ++a;


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}