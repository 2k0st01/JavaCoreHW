package binaryoperator.b;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
        List<Integer> list2 = new ArrayList<>(List.of(11,2,3,17,5,6,8));

        BinaryOperator<List<Integer>> binaryOperator = (a,b) -> {
            List<Integer> list3 = new ArrayList<>();
            for (int i = 0; i < a.size(); i++) {
                for (int j = 0; j < b.size(); j++) {
                    if(a.get(i) == b.get(j)){
                        list3.add(b.get(j));
                    }
                }
            }
            return list3;
        };

        System.out.println(binaryOperator.apply(list1,list2));
    }


}
