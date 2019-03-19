import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first number: ");
        int firstnumber = Integer.parseInt(reader.nextLine());
        System.out.println("Type the second number: ");
        int secondnumber = Integer.parseInt(reader.nextLine());
        if (firstnumber>secondnumber) {
            System.out.println("Greater number: "+firstnumber);}
         else if (firstnumber==secondnumber) { 
            System.out.println("The numbers are equal!");
        } else {
            System.out.println("Greater number: "+secondnumber);
        }

    }
}
