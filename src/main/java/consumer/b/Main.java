package consumer.b;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        Consumer<String> consumer= a -> {
            char[] c = a.toCharArray();
            for (int i = 0; i < c.length; i++) {
                    if(c[i] == '1' || c[i] == '2' || c[i] == '3' || c[i] == '4' || c[i] == '5' || c[i] == '6' ||
                            c[i] == '7' || c[i] == '8' || c[i] == '9' || c[i] == '0'){
                        list.add(a);
                        return;
                }
            }
        };

        consumer.accept("Hello");
        consumer.accept("World");
        consumer.accept("DayOf1");
        consumer.accept("I'm top 1");
        consumer.accept("My name in Mike");

        System.out.println(list);
    }
}
