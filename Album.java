public class Album {
    private String albumName;
    private Song song;

    public Album(String albumName, Song song){
        this.albumName = albumName;
        this.song = song;
    }

    public Song getSong(){
        return song;
    }

    public String getAlbumName(){
        return albumName;
    }


}
