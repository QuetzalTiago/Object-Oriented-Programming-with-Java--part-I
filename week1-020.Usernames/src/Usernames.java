
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String user = "alex";
        String userpass = "mightyducks";
        String user2 = "emily";
        String userpass2 = "cat";
        System.out.println("Type your username: ");
        String userdata = reader.nextLine();
        System.out.println("Type your password: ");
        String passdata = reader.nextLine();
        if ((userdata.equals(user))&&(userpass.equals(passdata))) {
        System.out.println("You are now logged into the system!");}
        else if ((userdata.equals(user2))&&(userpass2.equals(passdata))) {
        System.out.println("You are now logged into the system!");}
        else { System.out.println("Your username or password was invalid!");
     
            
        
        }
    }
}
