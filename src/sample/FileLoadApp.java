package sample;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileLoadApp {

    public static void main(String[] args) {
        String filePath = "";
        loadFile(filePath);
    }

    public static void loadFile(String path) {
        try {
            FileReader reader = new FileReader(path);
        } catch (FileNotFoundException e) {
            System.out.println("ファイルがみつかりませんでした");
        }
    }
}
