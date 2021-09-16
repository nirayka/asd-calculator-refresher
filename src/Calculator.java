import java.util.Scanner;

public class Calculator {
    private String operation;
    private double firstNum;
    private double secondNum;

    public void setOperation()
    {
        System.out.println("What operation would you like to perform?");
        Scanner scan = new Scanner(System.in);
        operation = scan.nextLine();
        if ((!operation.equals("+")) && (!operation.equals("-")) && (!operation.equals("*")) && (!operation.equals("/"))) {
            do {
                System.out.println("Sorry, that's not a valid operation. Make sure to input +, -, *, or /.");
                operation = scan.nextLine();
            } while ((!operation.equals("+")) && (!operation.equals("-")) && (!operation.equals("*")) && (!operation.equals("/")));
        }
    }

    public String getOperation() {
        return operation;
    }

    public void setNumOne() {
        System.out.println("What's the first number to which you'd like to perform this operation?");
        Scanner scan = new Scanner(System.in);
        firstNum = scan.nextDouble();
    }

    public double getNumOne() {
        return firstNum;
    }

    public void setNumTwo() {
        System.out.println("What's the second number to which you'd like to perform this operation?");
        Scanner scan = new Scanner(System.in);
        secondNum = scan.nextDouble();
        if (operation.equals("/") && secondNum == 0.0) {
            do {
                System.out.println("You can't divide by zero. Select another number as the divisor.");
                secondNum = scan.nextDouble();
            } while (secondNum == 0);
        }
    }

    public double getNumTwo() {
        return secondNum;
    }

    public double addition(double numOne, double numTwo) {
        return numOne + numTwo;
    }

    public double subtraction(double numOne, double numTwo) {
        return numOne - numTwo;
    }

    public double multiplication(double numOne, double numTwo) {
        return numOne * numTwo;
    }

    public double division(double numOne, double numTwo) {
        return numOne / numTwo;
    }
}