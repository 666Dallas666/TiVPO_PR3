import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Storage {
    List<Site> site = new ArrayList();
    List<Card> card = new ArrayList();
    public void menu() {
        Scanner sc = new Scanner(System.in);
        String a;
        while (true){
            System.out.println("Выберите действие:");
            System.out.println("1. Пароли сайтов");
            System.out.println("2. Банковские карты");
            System.out.println("3. Выход");
            a = sc.nextLine();
            if (a.equals("1")){
                site();
            }
            else if (a.equals("2")){
                card();
            }
            else if (a.equals("3")){
                break;
            }
        }
    }
    public void site(){
        Scanner sc = new Scanner(System.in);
        String a;
        while (true) {
            System.out.println(site);
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить данные");
            System.out.println("2. Удалить данные");
            System.out.println("3. Назад");
            a = sc.nextLine();
            if (a.equals("1")){
                String login;
                String password;
                System.out.println("Введите логин:");
                login = sc.nextLine();
                System.out.println("Введите пароль:");
                password = sc.nextLine();
                Site in = new Site(login, password);
                site.add(in);
                System.out.println("Данные обновлены");
            }
            else if (a.equals("2")){
                String login;
                System.out.println("Введите логин удаляемого аккаунта:");
                login = sc.nextLine();
                for(int i = 0; i < site.size(); i++){
                    if(login.equals(site.get(i).getLogin())){
                        site.remove(i);
                        System.out.println("Объект удален");
                    }
                    else System.out.println("Объект не найден");
                }
            }
            else if (a.equals("3")){
                break;
            }
        }
    }
    public void card(){
        Scanner sc = new Scanner(System.in);
        String a;
        while (true) {
            System.out.println(card);
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить данные");
            System.out.println("2. Удалить данные");
            System.out.println("3. Назад");
            a = sc.nextLine();
            if (a.equals("1")){
                String number;
                String name;
                String date;
                String cvv;
                System.out.println("Введите номер карты:");
                number = sc.nextLine();
                System.out.println("Введите имя владельца карты:");
                name = sc.nextLine();
                System.out.println("Введите дату валидности:");
                date = sc.nextLine();
                System.out.println("Введите cvv:");
                cvv = sc.nextLine();
                Card in = new Card(number, name, date, cvv);
                card.add(in);
                System.out.println("Данные обновлены");
            }
            else if (a.equals("2")){
                String number;
                System.out.println("Введите номер удаляемой карты:");
                number = sc.nextLine();
                for(int i = 0; i < card.size(); i++){
                    if(number.equals(card.get(i).getNumber())){
                        card.remove(i);
                        System.out.println("Объект удален");
                    }
                    else System.out.println("Объект не найден");
                }
            }
            else if (a.equals("3")){
                break;
            }
        }
    }
}
