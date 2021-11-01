import java.util.ArrayList;
import java.util.LinkedList;

public class PhoneBook {

//    Написать простой класс Телефонный Справочник,
//    который хранит в себе список фамилий и телефонных номеров.
//    В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
//    Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
//    тогда при запросе такой фамилии должны выводиться все телефоны. Желательно не добавлять лишний функционал
//            (дополнительные поля (имя, отчество, адрес), взаимодействие с пользователем через консоль и т.д).
//    Консоль использовать только для вывода результатов проверки телефонного справочника.


    ArrayList<String> name = new ArrayList<>();
    ArrayList<String> number = new ArrayList<>();

    //----------------метод добавления-------------------//


    public void add(String lastName, String numberPhone) {

        char charAtZero = lastName.charAt(0);



        if ((charAtZero < 65) || (charAtZero > 90)) {
            try {
                throw new NameException();


            } catch (NameException e) {
                e.printStackTrace();
            }
        } else name.add(lastName);


        if ((numberPhone.length()) != 10) {
            try {
                throw new NumberPhoneException();
            } catch (NumberPhoneException e) {
                e.printStackTrace();
            }
        } else number.add(numberPhone);

    }

    //----------------метод поиска-------------------//

        public void get (String lName){

            LinkedList<String> Ar = new LinkedList<>();


            for (int i = 0; i < name.size(); i++) {

                if (lName.equals(name.get(i))) {

                    Ar.add(number.get(i));

                }

            }
            if (!Ar.isEmpty()) {
                System.out.println("Фамилии " + lName + " соответствует номера телефонов: ");
                for (String s : Ar) System.out.println(s);
            } else System.out.println("Фамилии " + "\"" + lName + "\"" + " в справочнике не найдено");
        }



}
