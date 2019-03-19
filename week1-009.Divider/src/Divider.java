
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {      
        // Implement your program here. Remember to ask the input from user.
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number:");
        float x = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number:");
        float y = Integer.parseInt(reader.nextLine());
        float z = x/y;
        System.out.println("Division: "+x+" / "+y+" = "+z);
    }
}
