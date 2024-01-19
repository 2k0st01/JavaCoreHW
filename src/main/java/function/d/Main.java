package function.d;

import java.util.*;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        String s1 = "Hello my brother";
        String s2 = "Hello my sister";

        BiFunction<String, String, String[]> bif = (a, b) -> {
            Set<String> a1 = new HashSet<>(List.of(a.split(" ")));
            Set<String> b1 = new HashSet<>(List.of(b.split(" ")));
            Set<String> set = new HashSet<>(a1);

            set.retainAll(b1);
            String arr[] = set.toArray(new String[0]);
            if (set.isEmpty()) {
                System.out.println("Однакоаих слів не має");
            }
            return arr;
        };
        System.out.println(Arrays.toString(bif.apply(s1, s2)));
    }


}
