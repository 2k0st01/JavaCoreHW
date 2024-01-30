package comparator.b;

/*
Используя составной Comparator реализуйте в List<Integer> поиск числа модуль которого
наиболее близок к нулю. Если встретятся два модуль которых одинаково близок к нулю(например
5 и -5) то верните положительное значение.
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> array = new ArrayList<>(List.of(5, 7, -5));

        Comparator<Integer> firstComp = (a, b) -> Integer.compare(Math.abs(a), Math.abs(b));
        Comparator<Integer> secondComp = (a, b) -> {
            if (a > b) {
                return -1;
            }
            if (a < b) {
                return 0;
            }
            return 1;
        };
        Comparator<Integer> compThree = firstComp.thenComparing(secondComp);
        int min = Collections.min(array, compThree);
        System.out.println(min);

    }
}
