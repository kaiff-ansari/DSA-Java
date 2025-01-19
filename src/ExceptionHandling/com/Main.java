package ExceptionHandling.com;

public class Main {
    public static void main(String[] args) {

        int a = 5;
        int b = 0;

        try {
//            divide(a,b);
            // mimiking a random
            String name = "kaif";
            if(name.equals("kaif")) {
                throw new Exception("name is kaif");
            }

        }catch (MyExeption e){
            System.out.println(e.getMessage());
        }

        catch (Exception e){
            System.out.println("normal exception");
        }

        finally {
            System.out.println("this is will always run");
        }


    }

    static int divide(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new  ArithmeticException("please do not divide by zero");
        }
        return a/b;
    }
}
