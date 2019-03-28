public class Main {
    public static void main(String[] args) {
        // write testcode here
        Counter counter = new Counter(2, true);
        counter.decrease(22);
        counter.decrease();
        counter.decrease();
        System.out.println(counter.value());
    }
}
