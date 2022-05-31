package SongsServer.additional.song.predicate;

import SongsServer.additional.song.Song;

import java.util.Objects;
import java.util.function.Predicate;

/**
 * Класс для проверки соответствия на заданное значение названия
 */
public class FilterSampleSong implements Predicate<Song> {
    private final String rightNameSong;

    public FilterSampleSong(String rightNameSong) {
        this.rightNameSong = rightNameSong;
    }

    @Override
    public boolean test(Song song) {
        return Objects.equals(song.getNameSong(), rightNameSong);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FilterSampleSong that = (FilterSampleSong) o;
        return Objects.equals(rightNameSong, that.rightNameSong);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rightNameSong);
    }
}