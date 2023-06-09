package sample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileLoadApp {

    public static void main(String[] args) {
        String filePath = "./data/sample.txt";
        loadFile(filePath);

        try {
            loadFile2(filePath);
        } catch (FileNotFoundException e) {
            System.out.println("ファイルがみつかりませんでした");
        } catch (IOException e) {
            System.out.println("ファイルエラー");
        } finally {
            System.out.println("処理が終了しました");
        }
    }

    public static void loadFile(String path) {
        try {
            FileReader reader = new FileReader(path);
            BufferedReader buffer = new BufferedReader(reader);

            String line;
            // nullになるまで、1行ずつ読み込む
            while ((line = buffer.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("ファイルを読み込みました");
            // バッファーをとじる
            buffer.close();

        } catch (FileNotFoundException e) {
            System.out.println("ファイルがみつかりませんでした");
        } catch (IOException e) {
            System.out.println("データエラー");
        } finally {
            System.out.println("処理が終了しました");
        }
    }

    public static void loadFile2(String path) throws IOException, FileNotFoundException {
        FileReader reader = new FileReader(path);
        BufferedReader buffer = new BufferedReader(reader);

        String line;
        // nullになるまで、1行ずつ読み込む
        while ((line = buffer.readLine()) != null) {
            System.out.println(line);
        }
        System.out.println("ファイルを読み込みました");
        // バッファーをとじる
        buffer.close();
    }
}
