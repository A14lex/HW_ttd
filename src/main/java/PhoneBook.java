import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    //вывести или найти имя без полного перебора это наверно реализовать это в мапе
    Map<String, String> map = new HashMap<>();

    public int add(String name, String phoneNumber) {
        if (!map.containsKey(name)) {
            map.put(name, phoneNumber);
        }
        return map.size();
    }
}
