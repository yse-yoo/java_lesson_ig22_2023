package sample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileLoadApp {

    public static void main(String[] args) {
        String filePath = "./data/sample.txt";
        loadFile(filePath);
    }

    public static void loadFile(String path) {
        try {
            FileReader reader = new FileReader(path);
            BufferedReader buffer = new BufferedReader(reader);

            String line;
            //nullになるまで、1行ずつ読み込む
            while ((line = buffer.readLine()) != null) {
                System.out.println(line);
            }

            System.out.println("ファイルを読み込みました");
        } catch (FileNotFoundException e) {
            System.out.println("ファイルがみつかりませんでした");
        }
    }
}
