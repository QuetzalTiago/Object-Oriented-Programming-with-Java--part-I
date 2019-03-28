public class Printing {

    public static void printStars(int amount) {
        int i = 0;
        while(i<amount) {
        System.out.print("*");
        i++;}
        System.out.println("");
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times        
    }

    public static void printSquare(int sideSize) {
        int b = 0;
        while(b<sideSize) {
        printStars(sideSize);
        b++;}
        System.out.println("");
        // 39.2
    }

    public static void printRectangle(int width, int height) {
        int c = 0;
        while(c<height) {
        printStars(width);
        c++;
        }
        // 39.3
    }

    public static void printTriangle(int size) {
        int d = 0;
        int e = 1;
        while(d<size) {
        printStars(e);
        d++;
        e++;}
        // 39.4
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
