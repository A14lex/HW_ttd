import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    @Test
    public void testPhoneBookAdd(){
        Integer i = null;
        PhoneBook phoneBook = new PhoneBook();
         i = phoneBook.add("noName", "123");
        Assertions.assertTrue(i!=0, "Количество записей не изменилось после добавления нового имени");
    }
    public void testRepeatNumberAdd(){
        String name1 = "Nonna";
        String name2 = "Nonna";
        PhoneBook phoneBook = new PhoneBook();
        int countWithName1 = phoneBook.add(name1, "123");

        int countWithName2 = phoneBook.add(name2, "123");
        //Добавлены две записи с одинаковыми именами - кол-во записей должно быть 1
        Assertions.assertTrue(countWithName2==1, "Два одинаковых имени не изменили кол-во записей должным образом (на 1 т.е.)");
    }
}
