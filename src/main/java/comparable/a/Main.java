package comparable.a;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10,20);
        Rectangle r2 = new Rectangle(20,10);
        Rectangle r3 = new Rectangle(15,20);
        Rectangle r4 = new Rectangle(20,20);
        Rectangle r5 = new Rectangle(10,5);

        System.out.println(r1.compareTo(r2));
        System.out.println(r1.compareTo(r5));
        System.out.println(r2.compareTo(r3));
        System.out.println(r3.compareTo(r4));

    }

}
