public class Count {
    static int counter = 0;

    Count() {
        counter++;
    }

    public static void main(String[] args) {
        new Count();
        Count c = new Count();
        System.out.println(c.counter);
    }
}
