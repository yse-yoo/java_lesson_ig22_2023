package rpg.item;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ItemList {
    
    // CSV file path
    private final static String CSV_PATH = "./data/item.csv";
    // Item's data list
    public ArrayList<Item> list = new ArrayList<>();

    // Constructor
    public ItemList() {
        this.loadCsv();
    }

    // load item.csv & convert java data
    public void loadCsv() {
        FileInputStream file;
        InputStreamReader reader;
        BufferedReader buffer;

        try {
            file = new FileInputStream(CSV_PATH);
            System.out.println("CSV読み込み");
        } catch (FileNotFoundException e) {
            System.out.println("ファイルロードエラー");
        }

    }
    
}
