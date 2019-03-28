import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        for (;;) {
        System.out.println("Type a word: ");
        String data = reader.nextLine();
        if (data.isEmpty()) {
            System.out.println("You typed the following words: "+words);
            break;} 
        else {
        words.add(data);
        }
    }}
}
