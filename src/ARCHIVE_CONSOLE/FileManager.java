package ARCHIVE_CONSOLE;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileManager {
    public JTable[] ReadDataFromFile() {

        JTable[] data = new JTable[20];

        try {
            BufferedReader reader = new BufferedReader(new FileReader("CD_ArchivePrototype_SampleData.txt"));
            String Line;
            int index = 0;

            while (!(Line = reader.readLine()).isEmpty()) {

                Object[] temp = Line.split(",");

                data[index] = new JTable(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8], temp[9]);

                index++;

            }
            reader.close();
        } catch (Exception e) {

            System.out.println("Oh no An Error" + e.getMessage());
        }
        return data;
    }
}
