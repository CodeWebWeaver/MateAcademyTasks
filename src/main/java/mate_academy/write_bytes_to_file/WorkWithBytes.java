package mate_academy.write_bytes_to_file;

import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class WorkWithBytes {
    public void writeBytesToFile(String fileName, byte[] data) {
        //write your code here
        File file = new File(fileName);
        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            fileOutputStream.write(data);
        } catch (IOException e) {
            throw new RuntimeException("Can`t write to file", e);
        }
        Integer ind = 4;
    }
}
