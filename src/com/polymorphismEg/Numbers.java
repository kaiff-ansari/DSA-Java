package com.polymorphismEg;

public class Numbers {


    int sum(int a, int b){
        return a + b;

    }

    int sum(int a, int b, int c){
        return a + b+ c;
    }

    public static void main(String[] args) {

        Numbers numbers = new Numbers();
        numbers.sum(5,6);
        numbers.sum(7,8,9);

    }
}
