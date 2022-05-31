package SongsServer.additional.song.predicate;

import SongsServer.additional.song.Song;

import java.util.Objects;
import java.util.function.Predicate;

/**
 * Класс для проверки соответствия на заданное значение настроения
 */
public class FilterMood implements Predicate<Song> {
    private final String rightMood;

    public FilterMood(String rightMood) {
        this.rightMood = rightMood;
    }

    @Override
    public boolean test(Song song) {
        for (String songMood : song.getMood()) {
            if (Objects.equals(songMood, rightMood)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FilterMood that = (FilterMood) o;
        return Objects.equals(rightMood, that.rightMood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rightMood);
    }
}