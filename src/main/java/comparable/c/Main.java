package comparable.c;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Luska", 12);
        Cat cat2 = new Cat("Mopsik", 8);
        Cat cat3 = new Cat("Grisha", 3);
        Cat cat4 = new Cat("Kuzia", 5);
        Cat cat5 = new Cat("Vasilii", 1);

        Cat[] array = new Cat[] {cat1, cat2, cat3, cat4,cat5};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
