
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int max = reader.nextInt();
        int n = 0;
        int result;
        int sum = 0;
        while (n<=max) {
        result = (int)Math.pow(2, n);
        n++;
        sum = sum + result;
        }
        System.out.println("The result is "+sum);

    }
}
