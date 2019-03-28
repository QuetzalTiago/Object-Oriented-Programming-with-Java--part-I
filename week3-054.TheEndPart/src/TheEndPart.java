import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word:  ");
        String name = reader.nextLine();
        System.out.println("Length of the end part: ");
        int lengthOfTheEndPart =reader.nextInt();
        int b= (name.length() - lengthOfTheEndPart);
        int c= name.length();
        System.out.println("Result: "+name.substring(b,c));
    }
}
