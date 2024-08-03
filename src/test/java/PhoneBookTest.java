import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    @Test
    public void testRepeatNumberAdd(){
        String name1 = "Nonna";
        String name2 = "Nonna";
        PhoneBook phoneBook = new PhoneBook();
        int countWithName1 = phoneBook.add(name1, "123");

        int countWithName2 = phoneBook.add(name2, "123");
        //Добавлены две записи с одинаковыми именами - кол-во записей должно быть 1
        Assertions.assertTrue(countWithName2==1, "Два одинаковых имени не изменили кол-во записей должным образом (на 1 т.е.)");
    }
    @Test
    public void testPhoneBookAdd(){
        Integer i = null;
        PhoneBook phoneBook = new PhoneBook();
         i = phoneBook.add("noName", "123");
        Assertions.assertTrue(i!=0, "Количество записей не изменилось после добавления нового имени");
    }
    @Test
    public void testfindByNumber(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Nonna", "303");
        String name = phoneBook.findByNumber("303");
        Assertions.assertTrue("Nonna".equals(name), "Тест поиска имени по номеру не пройден");
    }
    @Test
    public void testFindByName(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Nonna", "303");
        String number = phoneBook.findByName("Nonna");
        Assertions.assertTrue("303".equals(number), "Тест поиска номера по имени не пройден");

    }
    @Test
    public void testPrintAllNames(){
        //здесь нужно проверить как этот метод выводит имена в алфавитном порядке
        /*
        Метод будет выводить набор имен, и нужно проверить что они вообще есть, и расположены в алфавитном порядке
         */
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Nonna", "303");
        phoneBook.add("Monna", "304");
        int i = 0; // счетчик вывода имен
        String postString="";// cтрока (имя), которая как-бы была предыдущей
        boolean b = false;//критерий что строки идут в алфавитном порядке
        if(phoneBook.printAllNames()!=null){
            for (String string :
                    phoneBook.printAllNames()) {


                if(i!=0){
                    b=(string.compareTo(postString))>0;
                    if(!b){
                        break;//критерий не выполняется хотя-бы один раз - нарушение условия
                    }
                }
                postString = string;
                i++;

            }
        }

        Assertions.assertTrue(b, "Имена выводятся не в алфавитном порядке (хотя бы один раз) или не выводятся вообще");

    }

}
