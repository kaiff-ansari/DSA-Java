package ArrayPrograms.com;

import java.util.Scanner;

public class question {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of the array");
        int size = sc.nextInt();
        sc.nextLine();

        String name[] = new String[size];

        System.out.println("enter the name ");
        for (int i = 0; i < size; i++){
            name[i]  = sc.nextLine();
        }

        for (int i = 0; i < name.length; i++){
            System.out.println(name[i]);
        }



    }



}
