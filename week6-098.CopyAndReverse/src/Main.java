
import java.util.Arrays;



public class Main {

    public static void main(String[] args) {
        // write testcode here
    int[] original = {1, 2, 3, 4};
    int[] reverse = reverseCopy(original);

    // print both
    System.out.println( "original: " +Arrays.toString(original));
    System.out.println( "reversed: " +Arrays.toString(reverse));
}
    public static int[] copy(int[] array) {
        int size = array.length;
        int[] copy = new int[size];
        for (int i=0; i<size;i++ ){
        copy[i]=array[i];
                }
        return copy;
    }
    public static int[] reverseCopy(int[] array) {
        int size = array.length;
        int b = 0;
        int[] copy = new int[size];
        for (int i=size-1;i>=0;i--){ 
        copy[i]=array[b];
        b++;
                }
        return copy;
    }
    
}
