
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write your code here
    System.out.println("Up to what number? ");
    int number = 1;    
    int data = Integer.parseInt(reader.nextLine());
    while (number <= data) {
    System.out.println(number);
    number ++;}
    }
}
