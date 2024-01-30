package unaryoperator.c;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(List.of("Hello", "World.", "How", "are", "you,", "my", "friends?"));

        UnaryOperator<List<String>> unaryOperator = a -> {
            List<String> list2 = new ArrayList<>();
            for (String s : a) {
                if (s.length() > 5) {
                    list2.add(s);
                }
            }
            return list2;
        };
        System.out.println(unaryOperator.apply(list1));
    }
}
