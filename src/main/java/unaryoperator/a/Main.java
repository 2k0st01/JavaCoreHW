package unaryoperator.a;

import java.util.Arrays;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Integer[] list = new Integer[]{1,2,3,4,5,6,7,8,9};

        UnaryOperator<Integer[]> unaryOperator = a -> {
            for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 != 0) {
                    a[i] = 0;
                }
            }
            return a;
        };
        unaryOperator.apply(list);
        System.out.println(Arrays.toString(list));
    }
}
