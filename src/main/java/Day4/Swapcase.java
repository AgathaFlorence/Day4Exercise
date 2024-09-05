package Day4;
import java.util.Scanner;


public class Swapcase {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put a word with different upper case or lower case: ");
        String word = scanner.nextLine();
        StringBuffer newWord = new StringBuffer(word);

        for (int i=0; i<word.length();i++) {
            if(Character.isLowerCase(word.charAt(i))){
            newWord.setCharAt(i,Character.toUpperCase(word.charAt(i)));

        } else if(Character.isUpperCase(word.charAt(i))){
            newWord.setCharAt(i,Character.toLowerCase(word.charAt(i)));
            }
        }
        System.out.println("String after the case is swapped: " + newWord);



    }
}
