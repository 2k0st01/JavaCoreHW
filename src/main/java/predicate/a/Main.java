package predicate.a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*1) С помощью реализации Predicat<String> реализуйте удаление со списка строк начинающихся с
определенной буквы. Например удалить все строки которые начинаются на букву F.*/
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Hello", "Apple", "Friends", "Ball", "Football"));
        System.out.println(list);
        list.removeIf(Main::test);
        list.removeIf(a -> a.startsWith("B"));
        System.out.println(list);
    }

    public static boolean test(String s) {
        if(s.startsWith("F")){
            return true;
        }
        return false;
    }
}
