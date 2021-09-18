import java.util.Scanner;
import java.lang.Math;

class SciCalculator extends Calculator {

    public void welcome() {
        System.out.println("Welcome to Nirayka's Scientific Calculator.");
    }

    public void run() {
        setOperation();
        String theOperation = getOperation();
        setNumOne();
        double firstNumber = getNumOne();
        setNumTwo();
        double secondNumber = getNumTwo();

        double answer = 0.0;

        if (theOperation.equals("+")) {
            answer = addition(firstNumber, secondNumber);
        } else if (theOperation.equals("-")) {
            answer = subtraction(firstNumber, secondNumber);
        } else if (theOperation.equals("*")) {
            answer = multiplication(firstNumber, secondNumber);
        } else if (theOperation.equals("/")) {
            answer = division(firstNumber, secondNumber);
        } else if (theOperation.equals("^")) {
            answer = exponentiation(firstNumber, secondNumber);
        } else if (theOperation.equals("log")) {
            answer = log(firstNumber, secondNumber);
        }

        if (theOperation.equals("log")) {
            System.out.println("log base " + firstNum + " of " + secondNumber + " = " + answer);
        } else {
            System.out.println("\n" + firstNumber + " " + theOperation + " " + secondNumber + " = " + answer);
        }
    }

    public void setOperation()
    {
        System.out.println("What operation would you like to perform?");
        Scanner scan = new Scanner(System.in);
        operation = scan.nextLine();
        if ((!operation.equals("+")) && (!operation.equals("-")) && (!operation.equals("*")) && (!operation.equals("/")) && (!operation.equals("^")) && (!operation.equals("log"))) {
            do {
                System.out.println("Sorry, that's not a valid operation. Make sure to input +, -, *, /, ^, or log.");
                operation = scan.nextLine();
            } while ((!operation.equals("+")) && (!operation.equals("-")) && (!operation.equals("*")) && (!operation.equals("/")) && (!operation.equals("log")));
        }
    }

    public double exponentiation(double numOne, double numTwo) {
        return Math.pow(numOne, numTwo);
    }

    public double log(double base, double logNumber) {
        return Math.log(logNumber) / Math.log(base);
    }

}