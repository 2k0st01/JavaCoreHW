package predicate.c;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/*
Используя реализацию Preticate<Cat> (в качестве Cat взять класс используемый в лекции) и
методы для логических функций, реализуйте удаление из списка Cat котов возраст которых
меньше определенного значения (задается как параметр), а имя по алфавиту идет после буквы
(задается так же как параметр). Например если первый параметр задан как 5, а второй как 'C' то
будет удален Cat [name=Timka, age=4], Cat [name=Kuzia, age=2].
*/
public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Umka", 12);
        Cat cat2 = new Cat("Luska", 5);
        Cat cat3 = new Cat("Barsic", 8);
        Cat cat4 = new Cat("Timka", 4);
        Cat cat5 = new Cat("Kuzia", 2);
        List<Cat> cats = new ArrayList<>(List.of(cat1, cat2, cat3, cat4, cat5));

        Predicate<Cat> pr1 = a -> a.getAge() < 5;
        Predicate<Cat> pr2 = a -> a.getName().toCharArray()[0] > 'C';
        cats.removeIf(pr1.and(pr2));
        System.out.println(cats);
    }
}
