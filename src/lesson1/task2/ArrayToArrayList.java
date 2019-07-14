package lesson1.task2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList<T> {

    public ArrayList<T> arrayToArrayList(T...array){
        ArrayList<T> result = new ArrayList<>(Arrays.asList(array));
        return result;
    }
    public static void main(String[] args) {
        ArrayToArrayList<String> str = new ArrayToArrayList<String>();
        System.out.println(str.arrayToArrayList("1","2","3","4","5").size());
        // Методом .size я проверил, что результат метода arrayToArrayList - ArrayList
        // т.к. у Array определение длины выполняет метод .length
    }
}
