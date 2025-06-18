public class Main {
    public static void main(String[] args) {
        Item[] items = {
            new Item(101, "Laptop", "Electronics"),
            new Item(102, "Shoes", "Fashion"),
            new Item(103, "Keyboard", "Electronics"),
            new Item(104, "Shirt", "Fashion"),
            new Item(105, "Mouse", "Electronics")
        };

        System.out.println("🔍 Linear Search:");
        Item resultLinear = Finder.linearSearch(items, "Keyboard");
        if (resultLinear != null)
            System.out.println("Found: " + resultLinear);
        else
            System.out.println("Item not found");

        Finder.sortItemsByName(items);  // Must sort before binary search

        System.out.println("\n🔍 Binary Search:");
        Item resultBinary = Finder.binarySearch(items, "Keyboard");
        if (resultBinary != null)
            System.out.println("Found: " + resultBinary);
        else
            System.out.println("Item not found");
    }
}
