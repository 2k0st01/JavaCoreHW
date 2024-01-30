package comparator.a;

/*
1) С помощью реализации Comparator<Cat> отсортируйте массив Cat в порядке возрастания
длинны имени. Т.е. сначала должны идти коты чье имя самое короткое.
*/

import java.util.Arrays;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Umka", 12);
        Cat cat2 = new Cat("Luska", 5);
        Cat cat3 = new Cat("Barsic", 8);
        Cat cat4 = new Cat("Timka", 5);
        Cat cat5 = new Cat("Kuzia", 2);
        Cat[] cats = new Cat[] { cat1, cat2, cat3, cat4, cat5 };
        System.out.println(Arrays.toString(cats));
        Comparator<Cat> sortCats = (a,b) -> {
            if(a.getName().length()> b.getName().length()) {
                return 1;
            }
            if(a.getName().length() < b.getName().length()) {
                return -1;
            }
            return 0;
        };
        Arrays.sort(cats, sortCats);

        System.out.println(Arrays.toString(cats));
    }
}

