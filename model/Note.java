import java.time.LocalDateTime;

public class Note {
 private String title;
    private String inhalt;
    private LocalDateTime createdAt;

    // Konstruktor erstellen, damit man mit etwas arbeiten kann
    public Note(String title, String inhalt){
        this.title = title;
        this.inhalt = inhalt;
        this.createdAt = LocalDateTime.now(); 
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getInhalt(){
        return inhalt;
    }

    public void setInhalt(String inhalt){
        this.inhalt = inhalt;
    }
    
    public LocalDateTime getCreatedAt(){
        return createdAt;
    }

    public String toString(){
        return "Titel: " + title + "\n" +
               "Inhalt: " + inhalt + "\n" +
               "Erstellt am: " + createdAt.toString();
    }
}
