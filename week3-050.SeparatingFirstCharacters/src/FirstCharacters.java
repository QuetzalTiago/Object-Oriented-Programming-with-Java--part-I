import java.util.Scanner;

public class FirstCharacters {
 public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int d = name.length();
        if (d>=3) {
        System.out.println("1. character: " + Character1(name));
        System.out.println("2. character: " + Character2(name));
        System.out.println("3. character: " + Character3(name));
        }
    }
    public static char Character1 (String name) {
        char character = name.charAt(0);
        return character;
    }
    public static char Character2 (String name) {
        char character = name.charAt(1);
        return character;
    } 
    public static char Character3(String name) {
        char character = name.charAt(2);
        return character;
    }
}