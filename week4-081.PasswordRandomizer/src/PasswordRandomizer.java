import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private Random random = new Random();
    private int lenght;
    

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.lenght=length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        int i = 0;
        String newPass = "";
        while (i<lenght){
        int number = this.random.nextInt(26);    
        char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
        newPass+=symbol;
        i++;}
        return ""+newPass;
    }
}
