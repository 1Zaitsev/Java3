package task2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class MainTask2 {
    public static void main(String[] args) throws IOException {
// Создание директории.
        File file1 = new File("Task2/files");
        file1.mkdirs();
// Создание коллекции файлов.
        ArrayList<InputStream> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            String pathName = "Task2/files/file" + (i+1) + ".txt";
            File file = new File(pathName);
            try {
                file.createNewFile();

                FileWriter writer = new FileWriter(pathName);
                String text = file.getAbsolutePath() + "\n";
                writer.write(text);
                writer.flush();

                arrayList.add(new FileInputStream(pathName));

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        SequenceInputStream in = new SequenceInputStream(Collections.enumeration(arrayList));

        int x;
        while ((x=in.read()) != -1){
            System.out.print((char) x);
        }
    }
}
