package Exceeption;

public class FinallyKeyword {

//    public static int greet(){
//        try {
//            int a = 50;
//            int b = 0;
//            int c = a / b;
//            return c;
//
//        } catch (Exception e) {
//            System.out.println(e);
//        } finally {
//            System.out.println(" cleaning up resources.. this is  end of the program ");
//        }
//        return 0;
//
//
//
//    }

    public static void main(String[] args) {
//       int b =  greet();
//        System.out.println(b);


       int x = 7;
       int y = 9;

       while(true){

           try {
               System.out.println(x/y);
           }
           catch (Exception e){
               System.out.println(e);
               break;
           }

           finally {
               System.out.println("i am finally for value x " + y);
           }
           y--;
       }






    }
}
