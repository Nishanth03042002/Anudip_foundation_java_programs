import java.util.Scanner;
import java.util.TreeMap;

public class SearchTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 28);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name to search: ");
        String name = sc.nextLine();
        if (map.containsKey(name)) {
            System.out.println("Age of " + name + ": " + map.get(name));
        } else {
            System.out.println("Name not found");
        }
        sc.close();
    }
}
