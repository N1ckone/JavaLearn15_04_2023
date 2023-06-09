package homeWork7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//#1 и 2
public class ArrayConverter <T> {
    public static void main(String[] args) {
        String[] strings = {"Moscow", "New-York", "London", "Paris", "Prague"};
        ArrayConverter<String> converter = new ArrayConverter<>();
        converter.replace(strings, 0,2 );
        System.out.println(Arrays.toString(strings)); // [London, New-York, Moscow, Paris, Prague]
        List<String> list = converter.toList(strings);
        System.out.println(list); //[London, New-York, Moscow, Paris, Prague]
    }

    public  void replace(T[] arr, int first, int last) {
       T temp = arr[first];
       arr[first] = arr[last];
       arr[last] = temp;
    }

    public ArrayList<T> toList(T[] arr) {
        ArrayList<T> list = new ArrayList<>();
        for (T t : arr) {
            list.add(t);
        }

        return list;
    }
}
