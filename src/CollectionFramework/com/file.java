package CollectionFramework.com;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file {

    public static void main(String[] args)  {

        // For create new file
//        File myfile = new File("Mynewfile.text");
//
//        try {
//            myfile.createNewFile();
//        }
//        catch (IOException e){
//            System.out.println("Unable to create this file");
//            e.printStackTrace();
//        }


        // Code for write in file


//        try{
//            FileWriter file = new FileWriter("Mynewfile.txt");
//            file.write("this is my java file");
//            file.close();
//
//        }
//        catch (IOException e){
//            e.printStackTrace();
//        }

        // Reading a file

//    File myfile = new File("Mynewfile.txt");
//
//    try{
//        Scanner sc = new Scanner(myfile);
//        while (sc.hasNextLine()){
//            String line = sc.nextLine();
//            System.out.println(line);
//
//        }
//        sc.close();
//
//    }
//    catch (IOException e){
//        e.printStackTrace();
//    }

        // Deleting file
        File file = new File("Mynewfile.text");
        if(file.delete()){
            System.out.println("i have deleted " + file.getName());
        }
        else {
            System.out.println("some error occurred while deleting file ");
        }


    }
}
