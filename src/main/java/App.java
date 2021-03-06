import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.*;


public class App {
    public static ArrayList<String> initMask(int wordLength) {
        ArrayList<String> mask = new ArrayList<>();
        for (int i = 0; i < wordLength; i++) {
            mask.add("*");
        }
        return mask;
    }
    public static List<Object> chooseWordChar(String word, ArrayList<String> mask) {
        Scanner scanner = new Scanner(System.in);
        String answer;
        System.out.println();
        do {
            System.out.println("Выберите букву");
            answer = scanner.nextLine();

        } while (answer.length() != 1);
        boolean found = false;
        for (int i = 0; i < word.length(); i++) {
            if (answer.toLowerCase().charAt(0) == word.charAt(i)) {
                mask.set(i, answer);
                found = true;
            }
        }
        return Arrays.asList(found, mask);
    }
    public static void start() throws IOException {
            Document doc = Jsoup.connect("https://calculator888.ru/random-generator/sluchaynoye-slovo").get();
            String word = doc.getElementById("bov").text().toLowerCase(Locale.ROOT);
            ArrayList<String> mask = initMask(word.length());
            do {
                System.out.println(word);
                for (int i = 0; i < word.length(); i++) {

                    System.out.print(mask.get(i));
                }
                List<Object> res = chooseWordChar(word, mask);
                boolean found = (Boolean) res.get(0);
                mask = (ArrayList<String>) res.get(1);
                if (!found) {
                    System.out.println("Неверный ответ");
                }
                if (!mask.contains("*")) {
                    System.out.println("Победа, открытие доступа");
                    break;
                }
            } while (true);
            Storage storage = new Storage();
            storage.menu();
    }
}