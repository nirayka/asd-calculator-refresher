public class Main {

    public static void main(String[] args) {
        Calculator doMath = new Calculator();
        doMath.setOperation();
        String theOperation = doMath.getOperation();
        doMath.setNumOne();
        double firstNumber = doMath.getNumOne();
        doMath.setNumTwo();
        double secondNumber = doMath.getNumTwo();

        double answer = 0.0;

        if (theOperation.equals("+")) {
            answer = doMath.addition(firstNumber, secondNumber);
        } else if (theOperation.equals("-")) {
            answer = doMath.subtraction(firstNumber, secondNumber);
        } else if (theOperation.equals("*")) {
            answer = doMath.multiplication(firstNumber, secondNumber);
        } else if (theOperation.equals("/")) {
            answer = doMath.division(firstNumber, secondNumber);
        }

        System.out.println(firstNumber + " " + theOperation + " " + secondNumber + " = " + answer);

//        System.out.println("The result of this operation is " + answer);
    }

}