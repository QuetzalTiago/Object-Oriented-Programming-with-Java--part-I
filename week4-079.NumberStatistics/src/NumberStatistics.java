
public class NumberStatistics {
    private int amountOfNumbers;
    private int sumOfNumbers;

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        amountOfNumbers=0;
        sumOfNumbers=0;
    }

    public void addNumber(int number) {
        // code here
        amountOfNumbers++;
        sumOfNumbers+=number;
    }

    public int amountOfNumbers() {
        // code here
        return amountOfNumbers;
    }
     public int sum() {        
        // code here
        return sumOfNumbers;
    }

    public double average() {
        // code here
        if (amountOfNumbers>0){
        return (double) sumOfNumbers/amountOfNumbers;
        }else { return 0;}
    }

}
    

