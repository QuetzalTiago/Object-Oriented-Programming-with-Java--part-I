
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int times = name.length();
        int sum = 1;
        int charCount = 0;
        while (sum<=times) {
         char character = name.charAt(charCount);
            System.out.println(sum+". character: "+character);
        sum++;
        charCount++;
        }
        
    }
}
