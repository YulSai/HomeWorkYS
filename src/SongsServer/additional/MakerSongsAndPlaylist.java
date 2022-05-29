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
import java.util.List;
import java.util.function.Predicate;

/**
 * Класс для обработки коллекции песен по заданным условиям
 */
public class MakerSongsAndPlaylist {
    private final String pathToFolder = "C:\\Users\\yluya\\IdeaProjects\\JD1\\HomeWork\\src\\SongsServer\\resources";

    /**
     * Метод формирует коллекцию песен по соответствию параметра "настроение" из выбранной песни
     *
     * @param songs    коллекция песен
     * @param nameSong название выбранной песни
     * @return отфильтрованную коллекцию
     */
    public List<Song> filterSongsExampleMood(List<Song> songs, String nameSong) {
        Predicate<Song> filterMood = new FilterMood(filterSongsFromSampleSongMood(songs, nameSong));
        return filterSongs(songs, filterMood);
    }

    /**
     * Метод формирует коллекцию песен по соответствию параметра "жанр" из выбранной песни
     *
     * @param songs    коллекция песен
     * @param nameSong название выбранной песни
     * @return отфильтрованную коллекцию
     */
    public List<Song> filterSongsExampleGenre(List<Song> songs, String nameSong) {
        Predicate<Song> filterGenre = new FilterGenre(filterSongsFromSampleSongGenre(songs, nameSong));
        return filterSongs(songs, filterGenre);
    }

    /**
     * Метод получает параметр "настроение" из выбранной песни
     *
     * @param songs    коллекция песен
     * @param nameSong название выбранной песни
     * @return значение "настроение" в String
     */
    public String filterSongsFromSampleSongMood(List<Song> songs, String nameSong) {
        String rightMood = "";
        for (Song s : songs) {
            if (s.getNameSong().equals(nameSong)) {
                rightMood = String.valueOf(s.getMood());
            }
        }
        return rightMood.replaceAll("\\[", "").replaceAll("]", "");
    }

    /**
     * Метод получает параметр "жанр" из выбранной песни
     *
     * @param songs    коллекция песен
     * @param nameSong название выбранной песни
     * @return значение "жанр" в String
     */
    public String filterSongsFromSampleSongGenre(List<Song> songs, String nameSong) {
        String rightGenre = "";
        for (Song s : songs) {
            if (s.getNameSong().equals(nameSong)) {
                rightGenre = String.valueOf(s.getGenre());
            }
        }
        return rightGenre.replaceAll("\\[", "").replaceAll("]", "");
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