
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        // Write code here
        for (int number:array){
            int size=array.length;
            if (number==array[size-1]){
                System.out.print(number);}
            else{
            System.out.print(number+", ");}
        }
    }
}
