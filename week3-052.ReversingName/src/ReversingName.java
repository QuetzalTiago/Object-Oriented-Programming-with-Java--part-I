import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int b = 1;
        int i = name.length() -1;
        System.out.print("In reverse order: ");
        while (b <= name.length()) {
            System.out.print(name.charAt(i));
            i--;
            b++;
        }
    }
}
            
 
