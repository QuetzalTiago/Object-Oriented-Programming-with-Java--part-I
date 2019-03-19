
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Type your program here
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int result;
        result = number%2;
        if (result==0) { 
            System.out.println("The number is even.");}
            else { System.out.println("The number is odd.");
        } 

    }
}
