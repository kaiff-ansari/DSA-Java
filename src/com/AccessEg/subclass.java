package com.AccessEg;

public class subclass  extends  A{

    public subclass(int num, String name) {
        super(num, name);
    }


    public static void main(String[] args) {
        subclass obj = new subclass(45,"kaifansari");

        int n = obj.num;


        System.out.println(obj instanceof subclass);
        System.out.println(obj.getClass().getName());
    }

}
