
public class Main {

    public static void main(String[] args) {
        // write testcode here
Apartment a1 = new Apartment(1,20,1000);
Apartment a2 = new Apartment(2,30,2000);
Apartment a3 = new Apartment(2, 23, 1500);
        System.out.println(a1.price());
        System.out.println(a2.price());
        System.out.println(a1.priceDifference(a2)); 
        }}