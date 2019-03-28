public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 0;
        while(i<amount) {
        System.out.print("*");
        i++;}
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        int i = 0;
        while(i<amount) {
        System.out.print(" ");
        i++;}
        // 40.1
    }

    public static void printTriangle(int size) {
        int a = 1;
        int c = 1;       
        int b = size-1;    
        while(a<=size) {
        printWhitespaces(b);
        printStars(c);
        a++;
        b--;
        c++;}
        // 40.2
    }

    public static void xmasTree(int height) {
        int a = 0;
        int b = height-1;
        int c = 0;
        int d = 1;
        int f = 0;
        while(a<height) {
        printWhitespaces(b);
        printStars(2*c+1);
        a++;
        b--;
        c++;}
        while (d<3) {
        f = height-1;
        printWhitespaces(f-1);
        printStars(3);
        d++;
        }
        
        
     
        // 40.3
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
// []*
// **
//***
//[ 
//  ]*
// **
//***