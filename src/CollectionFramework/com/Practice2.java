package CollectionFramework.com;

import java.io.FileWriter;
import java.io.IOException;

class Random {
    @Deprecated
    public void greet(){
        System.out.println("good evening");
    }
}

interface MyInterface{
    void display();
}
public class Practice2 {

    public static void main(String[] args) {
//        Random r = new Random();
//
//        r.greet();

//        MyInterface i = ()-> System.out.println("hello");
//        i.display();

        int i = 19;
        String table = "";
        for(int j = 0; j < 10; j++){
            table+= i + "X" + (j+1) + "=" + i*(j+1);
            table+= "\n";
        }

        try{
            FileWriter w = new FileWriter("Multiplication.txt");
            w.write(table);
            w.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
