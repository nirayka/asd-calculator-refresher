import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Calculator doMath = new SciCalculator();
        doMath.welcome();
        boolean repeat;
        do {
            doMath.run();
            System.out.println("\nWould you like to perform another operation?");
            Scanner scan = new Scanner(System.in);
            String yesOrNo = scan.nextLine();
            repeat = yesOrNo.equals("yes");
        } while (repeat);
    }

}