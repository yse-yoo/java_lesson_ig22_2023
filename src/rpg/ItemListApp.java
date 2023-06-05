package rpg;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ItemListApp {

    public static void main(String[] args) {
        FileInputStream file;
        InputStreamReader reader;
        BufferedReader buffer;

        try {
            file = new FileInputStream("./data/sample.txt");
            reader = new InputStreamReader(file, "UTF-8");
            buffer = new BufferedReader(reader);

            String line;
            while ((line = buffer.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
