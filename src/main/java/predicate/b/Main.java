package predicate.b;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/*
Используя реализацию Predicate<String> реализуйте удаление со списка строк, строки первая
буква которых задается отдельным массивом символов. Например если этот массив содержит
['h','a','t'] то со списка стоит удалить все строки которые начинаются с этих букв.
*/
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Hello", "Apple", "Friends", "Ball", "Football"));
        System.out.println(list);
        String[] ar = new String[]{"H", "A", "T"};
        arr(list, ar);
        System.out.println(list);
    }

    public static void arr(List<String> list, String[] a) {
        for (int i = 0; i < a.length; i++) {
            final int j = i;
            list.removeIf(n -> n.startsWith(a[j]));
        }
    }

}
