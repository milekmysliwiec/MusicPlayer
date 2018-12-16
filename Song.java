package player;

public class Song {

    private String artistName;
    private String title;
    private String album;
    private int year;



    public Song(String artistName, String title, String album, int year) {
        this.artistName = artistName;
        this.title = title;
        this.album = album;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Song{" +
                "artistName='" + artistName + '\'' +
                ", title='" + title + '\'' +
                ", album='" + album + '\'' +
                ", year=" + year +
                '}';
    }
}
