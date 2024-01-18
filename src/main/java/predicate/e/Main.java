package predicate.e;

import java.util.function.IntPredicate;

/*
Создайте такую реализацию IntPredicate которая будет возвращать true в случае когда сумма
цифр числа число четное. Например для 103 — вернет true, так 1+0+3 = 4.
 */
public class Main {
    public static void main(String[] args) {
        IntPredicate ipr = a -> {
            boolean tf = true;
            int sum = 0;
            while (a != 0 ){
                int b = a%10;
                sum+=b;
                a/=10;
            }
            if(sum != 4){
                tf = false;
            }
            return tf;
        };
        int a = 103;
        int b = 104;
        System.out.println(ipr.test(a));
        System.out.println(ipr.test(b));
    }
}
