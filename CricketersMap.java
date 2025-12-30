import java.util.HashMap;
import java.util.Map;

public class CricketersMap {
    public static void main(String[] args) {

        Map<String, Integer> scores = new HashMap<>();
        scores.put("Virat Kohli", 102);
        scores.put("Rohit Sharma", 89);
        scores.put("KL Rahul", 75);

        String searchName = "Rohit Sharma";

        if (scores.containsKey(searchName)) {
            System.out.println(searchName + "'s score: " + scores.get(searchName));
        } else {
            System.out.println("Batsman not found");
        }
    }
}
