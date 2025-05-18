package com.AccessEg;

public class A {

   protected int num;
    String name;
    int[] arr;


    public int getNum(int num){
        return num;
    }

    public void setNum(int num){
        this.num = num;
    }


    public A(int num, String name){

        this.num = num;
        this.name = name;
        this.arr = new int[num];

    }
}
