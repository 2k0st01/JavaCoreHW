package function.c;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        String s = "Hello Java";
        Function<String, String[]> f1 = a -> a.replaceAll(" ", "").split("");
        Function<String[], Integer> f2 = a -> {
            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum += a[i].hashCode();
            }
            return sum;
        };
        System.out.println(f2.apply(f1.apply(s)));
    }
}
