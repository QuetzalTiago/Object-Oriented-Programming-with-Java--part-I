import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int n = reader.nextInt();
        int i = 1;
        int mul = 1;
        while (i<=n) {
        mul = mul * i;
        i++;
        }
        System.out.println("Factorial is "+mul);        

    }
}
