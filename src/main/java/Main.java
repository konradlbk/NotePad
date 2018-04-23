import java.io.IOException;

public class Main {
    public static void main(String[] args) {


        Kalendarz kalendarz = new Kalendarz();
        try {
            kalendarz.addNote();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
