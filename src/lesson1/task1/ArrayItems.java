/*
Сделал просто через массив Object(закоментированно ниже), но сомневаюсь, что в этом смысл задания.
Не понял как в данном примере использовать дженерики. Метод придумал, а как его корректно применить не знаю.
 */

package lesson1.task1;


import java.util.Arrays;
import java.util.Collections;


public class ArrayItems<T> {
    public void swap(int FirstItem, int SecondItem, T...array){
        Collections.swap(Arrays.asList(array), FirstItem, SecondItem);
    }

    public static void main(String[] args) {
        ArrayItems test = new ArrayItems();
        test.swap(0,1, "1","2","3","4","5");
        System.out.println(test.getClass());

    }

}
//    public static void main(String[] args) {
//        Object [] array = new Object[5];
//        array[0]="one";
//        array[1]=2.0f;
//        array[2]=3;
//        array[3]=4L;
//        array[4]='\u01BC';
//        ArrayItems test = new ArrayItems();
//
//        System.out.println(Arrays.toString(array));
//        test.swap(0,2,array);
//        System.out.println(Arrays.toString(array));
//        test.swap(4,2,array);
//        System.out.println(Arrays.toString(array));
//
//    }
//
//    public void swap(int index1, int index2, Object [] array){
//
//        Object temp = array[index1];
//        array[index1] = array[index2];
//        array[index2] = temp;
//    }
//}
