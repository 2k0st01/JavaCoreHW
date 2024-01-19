package function.a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{5, 6, 7, 8, 9, 10};
        List<Integer> array2 = new ArrayList<>(Arrays.asList(array));
        Function<Integer[],Integer> f1 = Main::test;
        Predicate<Integer> p1 = Main::trueFalse;

        array2.removeIf(p1);

        System.out.println(f1.apply(array));
        System.out.println(array2);
    }

    public static boolean trueFalse(Integer a){
        if(a <= 1){
            return true;
        }
        for (int i = 2;i<=Math.sqrt(a);i++){
            if (a % i ==0){
                return true;
            }
        }
        return false;
    }

    public static Integer test(Integer[] c){
        int b = 0;
        for (int i :c){
            if (i<=1){
                b++;
                continue;
            }
            for (int a =2;a<=Math.sqrt(i);a++){
                if (i%a ==0){
                    b++;
                }
            }
        }
        return c.length - b;
    }

}

