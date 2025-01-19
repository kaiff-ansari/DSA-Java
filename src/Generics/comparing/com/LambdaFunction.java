package Generics.comparing.com;




import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunction {
    public static void main(String[] args){

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            arr.add(i + 1);
        }

//        arr.forEach((item) -> System.out.println(item * 2));

        Consumer<Integer> fun = (item) ->System.out.println(item * 2);

        arr.forEach(fun);

        Operation sum = (a,b) -> a + b;
        Operation product = (a,b) -> a * b;
        Operation sub = (a,b) -> a - b;

        LambdaFunction mycalc = new LambdaFunction();
        System.out.println(mycalc.operate(5,6,sum));
        System.out.println(mycalc.operate(4,6,product));
        System.out.println(mycalc.operate(7,4,sub));

    }

    private int operate(int a, int b, Operation op){
        return op.operation(a,b);
    }



}



interface  Operation {
    int operation(int a, int b);
}
