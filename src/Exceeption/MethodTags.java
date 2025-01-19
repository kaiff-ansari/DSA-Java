package Exceeption;

public class MethodTags {

    /**
     *
     * @param args These are arguments supplied to the command line
     */

    public static void main(String[] args) {
        System.out.println("this is main method ");
    }

    /**
     *
     * This is the method of Sum of Two Number which is passed two variables
     * @param i This is first number to add
     * @param j This is second number to add
     * @return Sum of two numbers as an integer
     * @throws Exception If i is 0
     * @deprecated This method is deprecated please use + Operator
     */

    public int add(int i , int j) throws Exception{
        if(i == 0){
            throw new Exception();
        }
        int c = i + j;
        return c;
    }
}
