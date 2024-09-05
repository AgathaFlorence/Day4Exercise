package Day4;
import java.util.Scanner;

public class Multiplytable {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int a;
        int b;
        for(a = 1; a <=n; ++a) {
            for (b = 1; b <=n; ++b) ;
            {
                System.out.printf(a+" ");
                System.out.print((a+a)+" ");
                System.out.print((a+a+a)+" ");
                System.out.print((a+a+a+a)+" ");
                System.out.print((a+a+a+a+a)+" ");
            }
            System.out.println();
        }

       }
}
