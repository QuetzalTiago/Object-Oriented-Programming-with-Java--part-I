
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        // write testcode here
int[] values = {8, 3, 7, 9, 1, 2, 4};
sort(values);
//System.out.println( Arrays.toString(values) );
    }
public static int smallest(int[] array) {
    // write the code here
    int smallest = 999999;
    int size = array.length;
    for (int i=0;i<size;i++){
        if (array[i]<smallest){
            smallest=array[i];
        }
    }
return smallest;
}
public static int indexOfTheSmallest(int[] array) {
    // code goes here
    int smallest = 999999;
    int size = array.length;
    int index=0;
    for (int i=0;i<size;i++){
        if (array[i]<smallest){
            smallest=array[i];
            index = i;
        }
    }
return index;
}
public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
    // write the code here
    int smallest = 999999;
    int size = array.length;
    int indexx=0;
    for (int i=index;i<size;i++){
        if (array[i]<smallest){
            smallest=array[i];
            indexx = i;
        }
    }
return indexx;
}
public static void swap(int[] array, int index1, int index2) {
    // code goes here
    int one = array[index1];
    int two = array[index2];
    array[index1]=two;
    array[index2]=one;
}
public static void sort(int[] array) {
    //int size = array.length;
    //mover array
    for (int j=0;j<array.length;j++)
    {
    System.out.println( Arrays.toString(array) );    
    int smallest = 999999;
    int size = array.length;
    int index=0;
    for (int i=j;i<size;i++){
        if (array[i]<smallest){
            smallest=array[i];
            index = i;
        }}   
    int one = array[index];
    int two = array[j];
    array[j]=one;
    array[index]=two;
    
        //System.out.println(array[i]);
   //minimo del array       
    }
        

}
}

