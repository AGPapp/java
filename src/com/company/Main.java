package com.company;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int one = arr[0];
        int i = arr.length - 1;
        int fin = arr[i];
        arr[0] = fin;
        arr[i] = one;

        System.out.println(arr[0] + (arr.length - 2));
       
    }
}