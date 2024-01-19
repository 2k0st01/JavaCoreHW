package function.b;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        String s = "Hello Java Developers";
        Function<String, Integer> f1 = a -> {
            int b = 0;
            a.toLowerCase();
            char[] c = a.toCharArray();
            for (int i = 0; i < c.length; i++) {
                if (c[i] != 'a' && c[i] != 'e' && c[i] != 'i' && c[i] != 'o' && c[i] != 'u' && c[i] != 'y'&& c[i] != ' '){
                    b++;
                }
            }
            return b;
        };
        System.out.println(f1.apply(s));
    }
}
