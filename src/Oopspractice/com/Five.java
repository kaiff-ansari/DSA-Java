package Oopspractice.com;

import java.security.PublicKey;

abstract class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public abstract void MakeSound();
    public String getName(){
        return name;
    }
}

class Dog extends Animal{

  public Dog(String name){
       super(name);
   }

    @Override
    public void MakeSound(){
        System.out.println(getName() + " Hue hue ");
    }
}


class Cat extends Animal{

    public Cat(String name){
        super(name);
    }

    @Override
    public void MakeSound(){

        System.out.println(getName() + " Meow Meow");

    }
}


public class Five {
    public static void main(String[] args) {
        Dog d = new Dog("puppy");
        Cat c = new Cat("Senorita");
        d.MakeSound();
        c.MakeSound();

    }
}
