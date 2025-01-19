package Nmethod.com;

public class main {
    public static int fact(int n){
        int fact = 1;
        int i;
        for(i=n;i>=1;i--)
        {
            fact=fact*i;
        }
        return fact;
    }


    public static void main(String[] args) {
        System.out.println(fact(5));

    }


}
