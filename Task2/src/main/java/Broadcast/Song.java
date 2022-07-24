package Broadcast;

public class Song extends BroadcastObject {
    private final String songName;
    private final String author;

    public Song(int length, String songName, String author) {
        super(length);
        this.songName = songName;
        this.author = author;
    }

    public String getSongName() {
        return songName;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songName='" + songName + '\'' +
                ", author='" + author + '\'' +
                ", programLength=" + programLength +
                '}';
    }
}
