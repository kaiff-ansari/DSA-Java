package Exceeption;

/**
 * This is to demonstrate what java doc is and how it is used in the industry
 * @author Kaif (mycode)
 * @version 0.1
 * @since 2002
 * @see java Docs
 */

class NegativeRadiusException extends Exception{


    @Override
    public String toString() {
        return "radius cannot be negative";
    }

    @Override
    public String getMessage() {
        return "radius cannot be negative";
    }
}
public class Thrown {
public static double area(int r) throws NegativeRadiusException{
    if(r < 0){
        throw new NegativeRadiusException();
    }
    double result = Math.PI * r *r;
    return result;
    }


   public static int divide(int a, int b) throws Exception{
        int result = a/b;
        return result;
    }

    public static void main(String[] args) {
       try {
//           int c = divide(7,0);
//           System.out.println(c);
           double ar = area(6);
           System.out.println(ar);

       }
       catch (Exception e){
           System.out.println("Exception");
       }



    }
}
