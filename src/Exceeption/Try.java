package Exceeption;

public class Try {
    public static void main(String[] args) {

        int a = 6000;
        int b = 0;
        try{
            int c = a/b;
            System.out.println("resul is " + c);

        }
        catch (Exception e){
            System.out.println("we failed to divide because of : ");
            System.out.println(e);
        }
        System.out.println("end of the program ");


    }

}
