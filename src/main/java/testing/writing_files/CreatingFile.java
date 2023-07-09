package testing.writing_files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreatingFile {

  /*
  String testTable = "supply,30\n" +
                "buy,10\n" +
                "buy,13\n" +
                "supply,17\n" +
                "buy,10";
        */
  public void createCSVFile(String testTable) {
    File file = new File("test.csv");
    try {
      file.createNewFile();
      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
      bufferedWriter.write(testTable);
      bufferedWriter.close();
    } catch (IOException e) {
      throw new RuntimeException("Can`t create", e);
    }
  }
}
