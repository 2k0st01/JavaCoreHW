package binaryoperator.a;

import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        BinaryOperator<String> binaryOperator = (a,b) -> {
            if(a.length() > b.length()){
                return a;
            }
            return b;
        };

        String s = binaryOperator.apply("Hello", "Java");
        System.out.println(s);
    }
}
