package SongsServer.runners;

import SongsServer.additional.MakerSongsAndPlaylist;
import SongsServer.additional.playlist.Playlist;
import SongsServer.additional.song.Song;
import SongsServer.additional.song.predicate.FilterGenre;
import SongsServer.additional.song.supplier.SongSupplierFromArray;
import SongsServer.additional.song.supplier.SongSupplierFromFile;

import java.util.List;
import java.util.Set;

/**
 * Класс с точкой входа для методов работы с песнями
 */
public class SongsServerTestMain {
    public static void main(String[] args) {
        MakerSongsAndPlaylist makerSongs = new MakerSongsAndPlaylist();
        String pathToFolder = "C:\\Users\\yluya\\IdeaProjects\\JD1\\HomeWork\\src\\SongsServer\\resources";

        // создаем список всех песен
        SongSupplierFromFile songSupplierFromFile = new SongSupplierFromFile();
        List<Song> songs = songSupplierFromFile.get();
        System.out.println("Список всех песен: " + songSupplierFromFile.get());
        System.out.println("_____________________");

        // создаем список всех песен отфильтрованных по жанру "классика"
        List<Song> songsClassic = makerSongs.filterSongs(songs, new FilterGenre("классика"));
        System.out.println("Список классической музыки: " + songsClassic);
        System.out.println("_____________________");

        // создаем список всех песен отфильтрованных по жанру "поп-рок"
        List<Song> songsRock = makerSongs.filterSongs(songs, new FilterGenre("поп-рок"));
        System.out.println("Список поп-рок музыки: " + songsRock);
        System.out.println("_____________________");

        // создаем список песен отфильтрованных по такому же настроению и жанру, как в искомой песне
        Set<Song> songsFromSampleSong = makerSongs.filterSongsFromSampleSong(songs, "Wings");
        System.out.println("Песни с таким же настроением и жанром: " + songsFromSampleSong);
        System.out.println("_____________________");

        // создаем список песен отфильтрованных по такому же настроению, как в искомой песне
        Set <Song> songsFromSampleSongMood = makerSongs.filterSongsExampleMood(songs, "Wings");
        System.out.println("Песни с таким же настроением: " + songsFromSampleSongMood);
        System.out.println("_____________________");

        // создаем список песен отфильтрованных по такому же жанру, как в искомой песне
        Set <Song> songsFromSampleSongGenre = makerSongs.filterSongsExampleGenre(songs, "Wings");
        System.out.println("Песни с таким же жанром: " + songsFromSampleSongGenre);
        System.out.println("_____________________");

        //создаем плейлист классической музыки и записываем в файл
        Playlist playlistClassic = new Playlist("Классическая музыка", "Под бокал вина", songsClassic);
        makerSongs.makeResultPlaylist(pathToFolder, playlistClassic);
        System.out.println("Плейлист классической музыки: " + playlistClassic);
        System.out.println("_____________________");

        //создаем плейлист рок музыки и записываем в файл
        Playlist playlistRock = new Playlist("Рок", "В авто для трассы", songsRock);
        makerSongs.makeResultPlaylist(pathToFolder, playlistRock);
        System.out.println("Плейлист поп-рок музыки: " + playlistRock);

        SongSupplierFromArray supplier = new SongSupplierFromArray();
        List<Song> songs2 = supplier.get();
        System.out.println(songs2);
    }
}