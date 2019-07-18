package task1;

import java.io.*;

public class MainTask1 {
    public static void main(String[] args) {
// Создание директории.
        File file1 = new File("Task1/files");
        file1.mkdirs();
//Создание Файла.
        File file2 = new File("Task1/files/1.txt");
        try {
            file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
//Заполнение текстового файла
        try(FileWriter writer = new FileWriter("Task1/files/1.txt", false)) {
            String text = "The BillyGoat knows the mountain best…stability and carving come effortlessly to Temple and his Billy Goat. Designed for deep days, Banked Slalom victories and resort ripping. Freestyle roots meet powerful high speed all mountain fluidity…Un-real Snowboarding.";
            writer.write(text);
            writer.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
// Чтение и вывод файла в консоль.
        try(FileInputStream in = new FileInputStream("Task1/files/1.txt")){
            byte [] array = new byte [128];
            int x;
            while((x=in.read(array))>0){
                System.out.println(new String(array, 0, x));
                }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
