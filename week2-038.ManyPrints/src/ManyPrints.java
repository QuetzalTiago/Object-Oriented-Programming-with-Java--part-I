
import java.util.Scanner;

public class ManyPrints {
    // NOTE: do not change the method definition, e.g. add parameters to method
    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
        
    }

    public static void main(String[] args) {
        // ask the user how many times the text should be printed
        Scanner reader = new Scanner(System.in);
        System.out.println("How many?");
        int a = reader.nextInt();
        // use the while structure to call the printText method several times
        int b = 0;
        while (b<a) {
         b++;   
         printText(); 
        }
    }
}
