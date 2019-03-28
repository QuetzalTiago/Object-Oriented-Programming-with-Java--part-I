
public class Least {

    public static int least(int number1, int number2) {
        // write program code here
        // do not print anything inside the method
        // method needs a return in the end
        int b = 0;
        if (number1>number2) {
        b = number2;}
        else if (number1<number2) {
        b = number1;   
        }
        return number1*0+b;
    }

    public static void main(String[] args) {
        int result = least(2, 7);
        System.out.println("Least: " + result);
    }
}
