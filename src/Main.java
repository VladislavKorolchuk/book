import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> booksList = new ArrayList<>(List.of("Война и Мир", "Галлант", "Холодные глаза", "Робинзон Крузо",
                "Руслан и Людмила", "Черный обелиск", "Тихий Дон", "Обломов", "Белый Клык", "Два капитана",
                "Солярис", "Игрок", "Пиковая дама", "Дядя Ваня", "Судьба человека", "Бедные люди",
                "Борис Годунов"));
      //  List<String> sortedBookList = booksList.stream().sorted().collect(Collectors.toList());
        List<List<String>> bookShelve = new LinkedList<>();
        List<String> shelve1 = new LinkedList<>();
        List<String> shelve2 = new LinkedList<>();
        List<String> shelve3 = new LinkedList<>();
        List<String> shelve4 = new LinkedList<>();
        List<String> shelve5 = new LinkedList<>();

        System.out.println(booksList.size());
        for (int i = 0; i < booksList.size(); i++) {
            switch (i % 5) {
                case 0:
                    shelve1.add(booksList.get(i));
                    break;
                case 1:
                    shelve2.add(booksList.get(i));
                    break;
                case 2:
                    shelve3.add(booksList.get(i));
                    break;
                case 3:
                    shelve4.add(booksList.get(i));
                    break;
                case 4:
                    shelve5.add(booksList.get(i));
                    break;
            }
        }
        Collections.sort(shelve1);
        Collections.sort(shelve2);
        Collections.sort(shelve3);
        Collections.sort(shelve4);
        Collections.sort(shelve5);
        System.out.println(shelve1);
        System.out.println(shelve2);
        System.out.println(shelve3);
        System.out.println(shelve4);
        System.out.println(shelve5);
    }
}