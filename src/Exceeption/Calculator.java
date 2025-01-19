package Exceeption;

import java.util.Scanner;

class InvalidInputException extends Exception{

    @Override
    public String toString() {
        return "cannot add 8 and 9";
    }

    @Override
    public String getMessage() {
        return "cannot add 8 and 9";
    }
}

class CannotDivideByZeroExceptipn extends Exception{

    @Override
    public String toString() {
        return "cannot divide by 0";
    }

    @Override
    public String getMessage() {
        return "cannot divide by 0";
    }
}

class MaxInputException extends Exception{

    @Override
    public String toString() {
        return "Input cannot greater than 100000";
    }

    @Override
    public String getMessage() {
        return "Input cannot greater than 100000";
    }

}class MaxMuliplyException extends Exception{

    @Override
    public String toString() {
        return "Input cannot greater than 7000";
    }

    @Override
    public String getMessage() {
        return "Input cannot greater than 7000";
    }

}

class CustomCalculator  {
    double add(double a, double b) throws MaxInputException, InvalidInputException{
        if(a > 100000 || b > 100000){
            throw new MaxInputException();
        }
        if(a == 8 || b == 9 ){
            throw new InvalidInputException();

        }

        return a + b;
    }

    double subtract(double a, double b) throws InvalidInputException, MaxInputException{
        if(a > 100000 || b > 100000){
            throw new MaxInputException();
        }
        if(a == 8 || b == 9 ){
            throw new InvalidInputException();

        }
        return a - b;
    }

    double multiply(double a, double b) throws MaxMuliplyException, InvalidInputException{
        if(a >= 7000 || b >= 7000){
            throw new MaxMuliplyException();
        }

        if(a == 8 || b == 9 ){
            throw new InvalidInputException();

        }
        return a * b;
    }

    double divide(double a, double b) throws CannotDivideByZeroExceptipn, InvalidInputException, MaxInputException{
        if(b == 0){
            throw new CannotDivideByZeroExceptipn();
        }
        if(a == 8 || b == 9 ){
            throw new InvalidInputException();

        }
        if(a > 100000 || b > 100000){
            throw new MaxInputException();
        }
        return a / b;
    }

    double reminder(double a, double b){
        return a % b;
    }
}
public class Calculator {

    public static void main(String[] args) throws InvalidInputException, CannotDivideByZeroExceptipn, MaxInputException, MaxMuliplyException{

        CustomCalculator c = new CustomCalculator();
//
//        c.divide(4,0);

//        c.add(1000000,6);

        c.multiply(7,70000);

    }
}
