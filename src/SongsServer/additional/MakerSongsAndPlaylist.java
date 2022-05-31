package SongsServer.additional;

import SongsServer.additional.playlist.Playlist;
import SongsServer.additional.song.Song;
import SongsServer.additional.song.predicate.FilterGenre;
import SongsServer.additional.song.predicate.FilterMood;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

/**
 * Класс для обработки коллекции песен по заданным условиям
 */
public class MakerSongsAndPlaylist {
    private final String pathToFolder = "C:\\Users\\yluya\\IdeaProjects\\JD1\\HomeWork\\src\\SongsServer\\resources";

    /**
     * Метод формирует коллекцию песен по соответствию параметров "настроение" и "жанр" из выбранной песни
     *
     * @param songs    коллекция песен
     * @param nameSong название выбранной песни
     * @return отфильтрованную коллекцию
     */
    public Set<Song> filterSongsFromSampleSong(List<Song> songs, String nameSong) {
        Set<Song> filterSongs = new HashSet<>();

        for (Song s : songs) {
            if (s.getNameSong().equals(nameSong)) {
                for (String genre : s.getGenre()) {
                    filterSongs.addAll(filterSongs(songs, new FilterGenre(genre)));
                }

                for (String mood : s.getMood()) {
                    filterSongs.addAll(filterSongs(songs, new FilterMood(mood)));
                }
            }
        }
        return filterSongs;
    }

    /**
     * Метод формирует коллекцию песен по соответствию параметра "настроение" из выбранной песни
     *
     * @param songs    коллекция песен
     * @param nameSong название выбранной песни
     * @return отфильтрованную коллекцию
     */
    public Set <Song> filterSongsExampleMood(List<Song> songs, String nameSong) {
        Set<Song> filterSongs = new HashSet<>();

        for (Song s : songs) {
            if (s.getNameSong().equals(nameSong)) {
                for (String mood : s.getMood()) {
                    filterSongs.addAll(filterSongs(songs, new FilterMood(mood)));
                }
            }
        }
        return filterSongs;
    }

    /**
     * Метод формирует коллекцию песен по соответствию параметра "жанр" из выбранной песни
     *
     * @param songs    коллекция песен
     * @param nameSong название выбранной песни
     * @return отфильтрованную коллекцию
     */
    public Set<Song> filterSongsExampleGenre(List<Song> songs, String nameSong) {
        Set<Song> filterSongs = new HashSet<>();

        for (Song s : songs) {
            if (s.getNameSong().equals(nameSong)) {
                for (String genre : s.getGenre()) {
                    filterSongs.addAll(filterSongs(songs, new FilterGenre(genre)));
                }
            }
        }
        return filterSongs;
    }

    /**
     * Метод фильтрует песни по указанному признаку
     *
     * @param songs  список песен
     * @param filter фильтр для отбора песен
     * @return отфильтрованный список песен
     */
    public List<Song> filterSongs(List<Song> songs, Predicate<Song> filter) {
        List<Song> filteredSongs = new ArrayList<>();

        for (Song s : songs) {
            if (filter.test(s)) {
                filteredSongs.add(s);
            }
        }
        return filteredSongs;
    }

    /**
     * Метод генерирует имя файла, создает файл для записи плейлиста и записывает в него указанный плейлист
     *
     * @param playlist плейлист песен, который будет записан в файл
     */
    public void makeResultPlaylist(String pathToFolder, Playlist playlist) {
        String pathToFile = pathToFolder + "\\" + playlist.getNamePlaylist() + " " + playlist.getDescription() + ".txt";
        File creator = new File(pathToFile);
        if (creator.exists()) {
            creator.delete();
        }
        try {
            creator.createNewFile();
        } catch (IOException e) {
            System.out.println("Не удалось создать файл");
            e.printStackTrace();
        }

        try {
            Path pathToFileLog = Path.of(pathToFile);
            String textLog = Files.readString(pathToFileLog, StandardCharsets.UTF_8);
            FileWriter writer = new FileWriter(pathToFile);
            writer.append(textLog).append(playlist.toString());
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}