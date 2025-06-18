public class Item {
    int itemId;
    String itemName;
    String category;

    public Item(int itemId, String itemName, String category) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.category = category;
    }

    public String toString() {
        return "ID: " + itemId + ", Name: " + itemName + ", Category: " + category;
    }
}
