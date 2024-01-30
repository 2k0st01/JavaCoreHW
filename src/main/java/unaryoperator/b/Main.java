package unaryoperator.b;

import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        String s = "Hello 123 world";

        UnaryOperator<String> unaryOperator = a -> {
            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    sb.append(c);
                }
            }
            return sb.toString();
        };

        System.out.println(unaryOperator.apply(s));
    }
}
