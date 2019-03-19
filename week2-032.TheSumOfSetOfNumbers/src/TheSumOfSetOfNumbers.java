
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int amount = 0;
        System.out.println("Until what? ");
        int data = Integer.parseInt(reader.nextLine());
        while (amount<=data) {
        sum = sum + amount;
        amount++;}
        System.out.println("Sum is "+sum);

    }
}
