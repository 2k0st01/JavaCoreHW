package predicate.d;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiPredicate;

/*
Используя реализацию BiPredicate<Integer, String> реализуйте удаление из Map<Integer, String>
всех пар ключ-значение для которых длинна строки значения не равна ключу этого значения.
Например такая пара как {3: «Hello»} должна быть удалена так как длинна «Hello» не равна 3, а
пара вида {4: «Java»} останется.
*/
public class Main {
    public static void main(String[] args) {
        Map<Integer, String> test = new HashMap<>(Map.of(3, "Hello", 4, "Java", 5, "Like"));
        System.out.println(test);
        BiPredicate<Integer, String> bip = (a, b) -> a == b.length();

        filterMap(test, bip);
        System.out.println(test);
    }

    public static <K, V> void filterMap(Map<K, V> test, BiPredicate<K, V> bip) {
        test.entrySet().removeIf(entry -> !bip.test(entry.getKey(), entry.getValue()));
    }
}
