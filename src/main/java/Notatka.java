import java.time.LocalDate;

public class Notatka {
    private String title;
    private TypeofNote type;
    private String content;
    private LocalDate data;

    public Notatka(String title, TypeofNote type, String content, LocalDate data) {
        this.title = title;
        this.type = type;
        this.content = content;
        this.data = data;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TypeofNote getType() {
        return type;
    }

    public void setType(TypeofNote type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
