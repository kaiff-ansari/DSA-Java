package Annotation.com;

import Annotation.com.B.C;

public class Main implements A, C {

   public void greet(){
       System.out.println("good evening");
   }

   public static void main(String[] args){
       Main obj = new Main();
       A.greeting();

   }

}
