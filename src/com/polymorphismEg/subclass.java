package com.polymorphismEg;

import com.AccessEg.A;

public class subclass extends A {

    public subclass(int num, String name){
        super(num,name);
    }

    public static void main(String[] args) {

        subclass obj = new subclass(5,"huheue");
        int num = obj.num;

    }
}
