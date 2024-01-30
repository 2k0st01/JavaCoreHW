package consumer.c;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.function.BiConsumer;

public class Main {

    public static void main(String[] args) {

        File file = new File("test.txt");

        BiConsumer<String, File> cons = (a, b) -> {
            try (PrintWriter pw = new PrintWriter(new FileWriter(b, true))) {
                pw.print(a + " ");
            } catch (IOException e) {
                e.printStackTrace();
            }
        };
        cons.accept("Hello", file);
        cons.accept("World", file);
    }
}

