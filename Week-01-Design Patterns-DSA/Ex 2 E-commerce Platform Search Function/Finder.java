import java.util.Arrays;
import java.util.Comparator;

public class Finder {
    public static Item linearSearch(Item[] items, String name) {
        for (Item item : items) {
            if (item.itemName.equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }

    public static Item binarySearch(Item[] items, String name) {
        int left = 0, right = items.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int compare = items[mid].itemName.compareToIgnoreCase(name);
            if (compare == 0)
                return items[mid];
            else if (compare < 0)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return null;
    }

    public static void sortItemsByName(Item[] items) {
        Arrays.sort(items, Comparator.comparing(i -> i.itemName.toLowerCase()));
    }
}
