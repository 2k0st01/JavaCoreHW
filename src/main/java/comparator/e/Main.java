package comparator.e;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("text1.txt");
        File file2 = new File("text2.txt");

        List<File> fileList = new ArrayList<>(List.of(file1, file2));

        Comparator<File> comp = Comparator.comparingInt(Main::number);
        fileList.sort(comp);

        for (File file : fileList) {
            System.out.println(file.getName());
        }
    }

    public static int number(File file) {
        StringBuilder sb = new StringBuilder();
        int number = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String txt = "";
            for (; (txt = br.readLine()) != null; ) {
                sb.append(txt);
            }
            String s = sb.toString();
            number = s.split("[,.\\-?!\\s]", -1).length - 1;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return number;
    }
}
