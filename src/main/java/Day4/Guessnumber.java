package Day4;
import java.util.Random;
import java.util.Scanner;


public class Guessnumber {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        //create random class
        Random numb = new Random();

        //Generate random number in range 1 to 100;
        int numbtoguess =numb.nextInt(100);

        int n;

        do{
           System.out.println("Put your number to guess: ");
           n = scanner.nextInt();
           if(n<numbtoguess) {
               System.out.println("Too low, guess again?");
           } else if( n>numbtoguess){
               System.out.println("Too high,guess again?");
           }
        } while (n != numbtoguess);
            System.out.println("Congratulations, you got the right number.");

    }
}
