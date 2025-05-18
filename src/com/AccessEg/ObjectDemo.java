package com.AccessEg;

public class ObjectDemo {

    int num;
    public ObjectDemo(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    public static void main(String[] args) {

        ObjectDemo obj = new ObjectDemo(56);
        System.out.println(obj.hashCode());
    }




}
