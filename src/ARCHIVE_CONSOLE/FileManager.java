package ARCHIVE_CONSOLE;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileManager {
    public JTableInputModel[] ReadDataFromFile() {

        JTableInputModel[] data = new JTableInputModel[9];

        try {
            BufferedReader reader = new BufferedReader(new FileReader("CD_ArchivePrototype_SampleData.txt"));
            String Line;
            int index = 0;

            while (!(Line = reader.readLine()).isEmpty()) {

                String[] temp = Line.split(";");

                data[index] = new JTableInputModel(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8]);

                index++;

            }
            reader.close();
        } catch (Exception e) {

            System.out.println("Oh no An Error" + e.getMessage());
        }
        return data;
    }
}
