import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        System.out.println("Для доступа в хранилише паролей требуется пройти игру на отгадывание слова:");
        App app = new App();
        app.start();
    }
}
