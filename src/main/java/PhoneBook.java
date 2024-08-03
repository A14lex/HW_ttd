import java.util.*;

public class PhoneBook {
    //вывести или найти имя без полного перебора это наверно реализовать это в мапе
    Map<String, String> mapOfName = new TreeMap<>();
    Map<String, String> mapOfNumber = new HashMap<>();

    public int add(String name, String phoneNumber) {
        if (!mapOfName.containsKey(name)) {
            mapOfName.put(name, phoneNumber);
            mapOfNumber.put(phoneNumber, name);
        }
        return mapOfName.size();
    }
    public String findByNumber(String number){
        //найти имя по номеру без полного перебора
        return mapOfNumber.get(number);
    }
    public String findByName(String name){
        //найти имя по номеру без полного перебора
//        return null;
        return mapOfName.get(name);
    }
    public Set<String> printAllNames(){
//        return mapOfName.keySet();
        return null;
    }

}
