package SongsServer.additional.song.predicate;

import SongsServer.additional.song.Song;

import java.util.Objects;
import java.util.function.Predicate;

/**
 * Класс для проверки соответствия на заданное значение жанра
 */
public class FilterGenre implements Predicate<Song> {
    private final String rightGenre;

    public FilterGenre(String rightGenre) {
        this.rightGenre = rightGenre;
    }

    @Override
    public boolean test(Song song) {
        for (String songGenre : song.getGenre()) {
            if (Objects.equals(songGenre, rightGenre)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FilterGenre that = (FilterGenre) o;
        return Objects.equals(rightGenre, that.rightGenre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rightGenre);
    }
}