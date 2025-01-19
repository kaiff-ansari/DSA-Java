import java.util.*;

 public class ArrayList {
     public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         System.out.println("enter the side ");
         int side = sc.nextInt();

        int  AreaOfSquare = side * side;
        int perimeter = 4 * side;
        System.out.println("area of square is ");
        System.out.println(AreaOfSquare);
        System.out.println("area of perimeter is " );
        System.out.println(perimeter);

     }
 }
