import java.util.ArrayList;
import java.util.Collections;

public class ReverseStringList {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("date");

        System.out.println("Original List: " + list);

        Collections.reverse(list);

        System.out.println("Reversed List: " + list);
    }
}
