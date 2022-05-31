package SongsServer.additional.song;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс с описанием объекта Song
 */
public class Song {

    private String singer;
    private String nameSong;
    private List<String> genre = new ArrayList<>();
    private List<String> mood = new ArrayList<>();
    private String lengthSong;

    public Song() {
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    public List<String> getMood() {
        return mood;
    }

    public void setMood(List<String> mood) {
        this.mood = mood;
    }

    public String getLengthSong() {
        return lengthSong;
    }

    public void setLengthSong(String lengthSong) {
        this.lengthSong = lengthSong;
    }

    @Override
    public String toString() {
        double time = Double.parseDouble(getLengthSong());
        int minute = (int) time / 60;
        int seconds = (int) (time - minute * 60);

        DecimalFormat dF = new DecimalFormat( "00.##" );
        String lengthSong = dF.format(minute) + ":" + dF.format(seconds);

        return getNameSong() + " - " + getSinger() + " " +
                lengthSong + "\n";
    }
}