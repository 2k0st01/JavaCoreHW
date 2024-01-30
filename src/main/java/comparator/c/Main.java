package comparator.c;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{62,2000,306,55};

        Comparator<Integer> sort = (a,b) ->{
            char[] a1 = a.toString().toCharArray();
            char[] b1 = b.toString().toCharArray();
            int al = a1.length;
            int bl = b1.length;
            if(a1[0] + a1[al-1] > b1[0]+ b1[bl-1]){
                return 1;
            }
            if(a1[0] + a1[al-1] < b1[0]+ b1[bl-1]){
                return - 1;
            }
            return 0;
        };

        Arrays.sort(array,sort);
        System.out.println(Arrays.toString(array));
    }
}
