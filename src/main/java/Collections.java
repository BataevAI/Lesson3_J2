import java.util.*;

public class Collections {

    public static void main(String[] args) {

        LinkedList<String> boardgames = new LinkedList<>();

        boardgames.add("Звездные войны");
        boardgames.add("Звездные Империи");
        boardgames.addFirst("Эклипс");
        boardgames.addLast("Брасс");
        boardgames.add("Эклипс");
        boardgames.add("Forbidden stars");
        boardgames.addFirst("Forbidden stars");
        boardgames.add("Война кольца");
        boardgames.add("Немезида");
        boardgames.add("Звездные Империи");
        boardgames.add("Эклипс");
        boardgames.add("La Cosa nostra");
        boardgames.addFirst("Немезида");
        boardgames.addLast("7 Чудес");
        boardgames.add("Война кольца");
        boardgames.add(5, "Roll for the galaxy");
        boardgames.add("Эклипс");

        System.out.println(boardgames);

        Set<String> set = new HashSet<>(boardgames);

        System.out.println("Множество уникальных значений:");
        System.out.println(" ");
        System.out.println(set);

        Map<String, Integer> map = new HashMap<>();

        ArrayList<String> Arr = new ArrayList<>(set);

        // System.out.println(Arr);
        set.clear();

        for (String s : Arr) {
            int t = 0;
            for (String boardgame : boardgames) {

                if (s.equals(boardgame)) {
                    t += 1;
                }
            }
            map.put(s, t);
        }

        for (Map.Entry<String, Integer> map1 : map.entrySet()) {

            System.out.println("Игра: " + map1.getKey() + ", всего в списке: " + map1.getValue());
        }
// Добавление и вывод информации справочника

        PhoneBook ph = new PhoneBook();

        ph.add("Bataev", "2465764573");
        ph.add("Serpuhov", "4567812345");
        ph.add("Dimanov", "9639112354");
        ph.add("Baranov", "9278347623");
        ph.add("Baranov", "9278347677");
        ph.add("Bataev", "9635467381");
        ph.add("Rihter", "9176537634");
        ph.add("Rihter", "9134657512");
       ph.add("Khan", "9134657512");
       //ph.add("Пржевальский", "9134657512"); Ошибка!
        //ph.add("Пржевальский", "911"); Ошибка!

        ph.get("Bataev");
        ph.get("Rihter");
        ph.get("Mister Shmidth");

    }

}