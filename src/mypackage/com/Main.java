package mypackage.com;




public class Main {
    public static void main(String[] args){
        Human kaif = new Human(21,"kaif",10000,false);
        Human rahul = new Human(22,"rahul",12000,true);
        Human sumit = new Human(23,"sumit",15000,false);
        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);

//       Main obj = new obj(); // we can access the non static methoo using object
//       obj.details();






    }


    // this is dependent on the object non static method cannot run into static method
//    void sayAnyThing(){
//        System.out.println("good evening ");
//    }

    // if  i use static keyword it is accessble in main method

    static void say(){

        System.out.println("good evening ");
    }

//    void details(){
//        System.out.println("hue hue ");
//    }


}
