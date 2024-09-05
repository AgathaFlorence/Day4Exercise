package Day4;
import java.util.Scanner;
public class Continuestop {
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);

        String input;

        do {
            System.out.print("Hello!" + "\n" + "1. Please press y to continue" + "\n" + "2. Please press n to stop" + "\n");
            input = scanner.nextLine();

        } while (input.equals("y"));

        System.out.print("End of the program");


    }
}
