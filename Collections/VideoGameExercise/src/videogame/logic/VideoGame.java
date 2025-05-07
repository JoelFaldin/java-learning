package videogame.logic;

public class VideoGame {
    private int code;
    private String title;
    private String console;
    private int amountOfPlayers;
    private String category;

    public VideoGame() {
    }

    public VideoGame(int code, String title, String console, int amountOfPlayers, String category) {
        this.code = code;
        this.title = title;
        this.console = console;
        this.amountOfPlayers = amountOfPlayers;
        this.category = category;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public int getAmountOfPlayers() {
        return amountOfPlayers;
    }

    public void setAmountOfPlayers(int amountOfPlayers) {
        this.amountOfPlayers = amountOfPlayers;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "VideoGame{" + "code=" + code + ", title=" + title + ", console=" + console + ", amountOfPlayers=" + amountOfPlayers + ", category=" + category + '}';
    }
    
    
}
