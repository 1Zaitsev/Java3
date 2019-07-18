package task3;

import java.io.IOException;

public class MainTask3 {
    public static void main(String[] args) throws IOException {
        ReadText rt = new ReadText("Task3/files/1.txt");
        rt.showPage(1);
    }
}
