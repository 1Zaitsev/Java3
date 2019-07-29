package lesson6;

public class ArrayMethods {

    public static int[] splitBy4(int [] array){
        for(int i = array.length - 1; i>0; i--){
            if(array[i] == 4) {
                int[] part = new int[array.length - i - 1];
                System.arraycopy(array, (i + 1), part, 0, part.length);
                return part;
            }
        }
        throw new RuntimeException("В массиве не обнаружена цифра 4");
    }

    public static boolean isThereOneOrFour(int[] array){

        boolean isThereOne = false;
        boolean isThereFour = false;

        if(array.length == 0) return false;
        else{
            for(int i = 0; i < array.length; i++){
                if(array[i] == 1) {
                    isThereOne = true;
                }else{
                    if(array[i] == 4){
                        isThereFour = true;
                    } else {
                        return false;
                    }
                }
            }
            return isThereFour && isThereOne;
        }
    }
}
