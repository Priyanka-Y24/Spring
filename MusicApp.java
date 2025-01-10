import java.util.*;
public class MusicApp {
    private List<Song> songs;

    private List<Album> albums;

    public MusicApp(){
        songs = new ArrayList<>();
        albums = new ArrayList<>();
    }

    public void addSong(Song song){
        songs.add(song);
    }

    public void addAlbum(Album album){
        albums.add(album);
    }

}
