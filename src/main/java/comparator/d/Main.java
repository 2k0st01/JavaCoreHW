package comparator.d;
/*Создайте такую реализацию Comparator<Integer> что бы с ее помощью можно было найти
максимальное простое число в списке целых чисел, если такого числа в списке нет то должно
быть возвращено минимальное число.*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(102,103,67,65,293);
        Comparator<Integer> comp = (a,b) -> {
            if (a>=b){
                return -1;
            }else {
                return 1;
            }

        };
        numbers1.sort(comp);
        System.out.println(check(numbers1));
    }

    static Integer check(List<Integer> a){
        if (a.get(0).equals(a.get(1))) {
            return a.get(a.size()-1);
        }else {
            return a.get(0);
        }
    }
}
