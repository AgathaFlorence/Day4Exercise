package Day4;
import java.util.Scanner;

public class Multiplytable {
    public static void main (String[] args){

        System.out.print("Please input the mupltiplication table number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        int a;
        int b;
        for(a = 1; a <=n; a++) {
            for (b = 1; b <=n; b++){
                System.out.printf(a*b+" ");

            }
            System.out.println();
        }

       }
}
