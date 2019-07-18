package task3;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class ReadText {
    private int pageSize = 1800;
    private byte[] page = new byte[pageSize];
    private String pathName;
    private long fileLength;

    public ReadText(String pathName) {
        this.pathName = pathName;
        File file = new File(pathName);
        if (!file.exists()) {
            System.err.println("Файл" + pathName + "не найден");
            return;
        } else {
            fileLength = file.length();
        }
    }

    public void showPage(int pageNumber) throws IOException {
        if (pageNumber * pageSize > fileLength){
            System.err.println("Старницы № " + pageNumber + " в документе нет. \n В документе " + fileLength/pageSize + "станиц");
            return;
        }
        Arrays.fill(page, (byte)0);
        RandomAccessFile rf = new RandomAccessFile(pathName, "r");
        rf.seek(pageSize*(pageNumber-1));
        rf.read(page);
        System.out.println("СТраница № " + pageNumber);
        for(byte o: page){
            System.out.print((char) o);
        }
    }
}

