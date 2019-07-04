
package lesson1.task1;

import java.util.Arrays;

public class ArrayItems {

    public static void main(String[] args) {
        Object [] array = new Object[5];
        array[0]="one";
        array[1]=2.0f;
        array[2]=3;
        array[3]=4L;
        array[4]='\u01BC';
        ArrayItems test = new ArrayItems();

        System.out.println(Arrays.toString(array));
        test.swap(0,2,array);
        System.out.println(Arrays.toString(array));
        test.swap(4,2,array);
        System.out.println(Arrays.toString(array));

    }

    public void swap(int index1, int index2, Object [] array){

        Object temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
