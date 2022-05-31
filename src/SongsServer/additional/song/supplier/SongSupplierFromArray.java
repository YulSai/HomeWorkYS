package SongsServer.additional.song.supplier;

import SongsServer.additional.song.Song;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
/**
 * Класс для создания списка объектов с данными из массива
 */
public class SongSupplierFromArray implements Supplier<List<Song>> {
    private final String[] songsString = new String[]{"Sky inhabitants - Wings - рок - драм - 200", "В.Цой - Кукушка - рок - грусть - 300",
            "Vanessa Mae - Contradanza - классика - эмоциональное - 250"};

    /**
     * Метод наполняет объект данными и создает коллекцию объектов
     * @return коллекцию песен
     */
    @Override
    public List<Song> get() {
        List <Song> songs = new ArrayList<>();
        for (String s : songsString) {
            Song song = new Song();
            String[] arr = s.split(" - ");
            song.setSinger(arr[0]);
            song.setNameSong(arr[1]);

            List<String> genres = List.of(arr[2].split(" *, * "));
            for (String genre : genres){
                song.getGenre().add(genre);
            }

            List<String> moods = List.of(arr[3].split(" *, * "));
            for (String mood : moods){
                song.getMood().add(mood);
            }
            song.setLengthSong(arr[4]);
            songs.add(song);
        }
        return songs;
    }
}