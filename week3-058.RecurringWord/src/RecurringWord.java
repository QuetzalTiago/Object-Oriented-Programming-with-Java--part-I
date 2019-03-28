
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
    ArrayList<String> words = new ArrayList<String>();
        for (;;) {
        System.out.println("Type a word: ");
        String data = reader.nextLine();
        if (words.contains(data)) {
            System.out.println("You gave the word " +data+" twice ");
            break;} 
        else {
        words.add(data);
        }
    }}
}