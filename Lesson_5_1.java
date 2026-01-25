import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lesson_5_1 {

    private Map<String, List<String>> map = new HashMap<>();

    public void add(String surname, String phone) {
        if (map.containsKey(surname)) {
            map.get(surname).add(phone);
        } else {
            List<String> list = new ArrayList<>();
            list.add(phone);
            map.put(surname, list);
        }
    }

    public List<String> get(String surname) {
        return map.get(surname);
    }

    public static void main(String[] args) {
        Lesson_5_1 phonebook = new Lesson_5_1();

        phonebook.add("Пашков", "89001112233");
        phonebook.add("Севостьянов", "89005556677");
        phonebook.add("Пашков", "89003334455");

        System.out.println("Пашков: " + phonebook.get("Пашков"));
        System.out.println("Севостьянов: " + phonebook.get("Севостьянов"));
    }
}