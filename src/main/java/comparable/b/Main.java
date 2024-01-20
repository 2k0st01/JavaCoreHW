package comparable.b;

public class Main {
    public static void main(String[] args) {
        String[] s = new String[]{"Hello", "Java", "World", "Comparable", "Apple", "Zebra"};
        Integer[] i = new Integer[]{10, 23, 32,1,3,65};

        System.out.println(max(s));
        System.out.println(max(i));
    }

    public static <T extends Comparable<T>> T max(T[] array){
        T result = array[0];
        for(int i = 0; i< array.length; i++){
            if(array[i].compareTo(result) > 0 ){
                result = array[i];
            }
        }
        return result;
    }
}
