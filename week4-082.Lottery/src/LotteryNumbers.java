import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private Random random = new Random();
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        int i=0;
        while (i<7){
        int number=this.random.nextInt(40);
        if (numbers.contains(number)){
        }else{
            if (number>0){
              numbers.add(number);
              i++;}}}
        
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        if (numbers.contains(number)){
        return true;
        }else{
            return false;}
        
    }
}
