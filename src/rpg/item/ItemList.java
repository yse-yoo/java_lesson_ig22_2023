package rpg.item;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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
            reader = new InputStreamReader(file, "UTF-8");
            buffer = new BufferedReader(reader);

            // 最初の1行を読み込む
            String line = buffer.readLine();

            // 2行目から読み込む
            while ((line = buffer.readLine()) != null) {
                System.out.println(line);
                // , でくぎって、配列にする
                String[] data = line.split(",");

                long id = Long.parseLong(data[0]);
                String name = data[1];
                ItemType itemType = ItemType.valueOf(data[2].toUpperCase());
                int price = Integer.parseInt(data[3]);
                int attackPower = Integer.parseInt(data[4]);
                int defencePower = Integer.parseInt(data[5]);

                Item item = new Item(id, name, attackPower, defencePower, price, itemType);
                list.add(item);
            }
            System.out.println("CSV読み込み");
        } catch (FileNotFoundException e) {
            System.out.println("ファイルロードエラー");
        } catch (IOException e) {
            System.out.println("データエラー");
        }

    }
    
}
