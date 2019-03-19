
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here 
        double pi;
        pi = 3.14159265359;
        System.out.println ("Enter the radius:");
        double radius = Integer.parseInt(reader.nextLine());
        System.out.println ("Circumference of the circle: " + (2*pi*radius));
        
        
        
    }
}
