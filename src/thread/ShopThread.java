package thread;

public class ShopThread extends Thread {
    
    private Item item;

    ShopThread(Item item) {
        this.item = item;
    }

    public void run() {
        item.order();
    }
}
