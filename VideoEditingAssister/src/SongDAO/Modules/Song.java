package SongDAO.Modules;

public class Song {
    private final String name;
    private final String author;
    private final int duration;

    public Song(String name, String author, int duration){
        this.name = name;
        this.author = author;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getDuration() {
        return duration;
    }
}
