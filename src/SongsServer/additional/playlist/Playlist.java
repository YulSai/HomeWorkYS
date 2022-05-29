package SongsServer.additional.playlist;

import SongsServer.additional.song.Song;

import java.util.List;

/**
 * Класс с описанием объекта Playlist
 */

public class Playlist {
    private String namePlaylist;
    private String description;
    private List<Song> songs;
    private int number;

    public Playlist() {
    }

    public Playlist(String namePlaylist, String description, List<Song> songs) {
        this.namePlaylist = namePlaylist;
        this.description = description;
        this.songs = songs;
    }

    public String getNamePlaylist() {
        return namePlaylist;
    }

    public void setNamePlaylist(String namePlaylist) {
        this.namePlaylist = namePlaylist;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        int number = 0;
        for (Song song : songs)
            builder.append(++number).append(". ").append(song);
        return namePlaylist + " " + description + "\n" + builder;
    }
}