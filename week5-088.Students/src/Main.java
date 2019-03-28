
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        while (true){
        System.out.println("name:");
        String name = reader.nextLine();
        if (name.equals("")){break;}
        System.out.println("studentnumber:");
        String number = reader.nextLine();
        Student newStudent = new Student(name, number);
        list.add(newStudent);}
        for(Student newStudent:list){
        System.out.println(newStudent);}
        System.out.println("Give search term:");
        String search = reader.nextLine();
        System.out.println("Result:");
        for(Student newStudent:list){
            if (newStudent.getName().contains(search)){
                System.out.println(newStudent);}
        }
    }
}
  