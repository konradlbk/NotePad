import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Kalendarz {
    List<Notatka> Notes = new ArrayList<>(Arrays.asList());


    public void addNote() throws IOException {
        System.out.println("Wpisz tytuł notatki");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        System.out.println("Podaj typ notatki(swieto, wydarzenie, spotkanie");
        String type = scanner.nextLine().toUpperCase();

        System.out.println("Wpisz tresc notatki");
        String content = scanner.nextLine();
        System.out.println("Podaj datę notatki w formacie dd-MM-yyyy");
        String date = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);


        Notatka note = new Notatka(title, TypeofNote.valueOf(type), content, localDate);

        System.out.println("Podaj nazwę pliku");
        String name = scanner.nextLine();

        File directory = new File("C:\\Notes");
        if (!directory.exists()) {
            directory.mkdir();
        }

        File newNote = new File("C:\\Notes\\" + name + ".txt");
        FileWriter writer = new FileWriter(newNote);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write("Tytuł notatki: " + title);
        bufferedWriter.newLine();
        bufferedWriter.write("Typ notatki: " + type);
        bufferedWriter.newLine();
        bufferedWriter.write("Treść: " + content);
        bufferedWriter.newLine();
        bufferedWriter.write("Data: " + localDate);


        bufferedWriter.close();
        Notes.add(note);

    }

//    public void wyswietlNotatki() throws FileNotFoundException {
//
//        System.out.println("Podaj datę w celu wyszukania notatek");
//        Scanner scanner = new Scanner(System.in);
//        String data2 = scanner.nextLine();
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        LocalDate localDate = LocalDate.parse(data2, formatter);
//
//        File folder = new File("C:\\Kalendarz");
//
//
//    }


}
