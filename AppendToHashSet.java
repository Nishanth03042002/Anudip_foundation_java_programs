import java.util.HashSet;

public class AppendToHashSet {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();

        fruits.add("banana");
        fruits.add("data");
        fruits.add("apple");
        fruits.add("cherry");

        System.out.println("Updated HashSet: " + fruits);
    }
}
