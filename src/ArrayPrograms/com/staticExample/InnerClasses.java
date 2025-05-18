package ArrayPrograms.com.staticExample;

public class InnerClasses {

   static class Tests {
       String name;

       public Tests(String name) {
           this.name = name;
       }

   }

    public static void main(String[] args) {
        Tests obj = new Tests("kaif");
        Tests  obj2 = new Tests("altaf");
        System.out.println(obj.name);
        System.out.println(obj2.name);
    }
}



