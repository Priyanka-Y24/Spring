import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Song {
    private String name;
    private double duration;

    Song(String name, double duration){
        this.name = name;
        this.duration = duration;
    }
    public String getName(){
        return name;
    }

    public double getDuration(){
        return duration;
    }

//    public void addSong(String name, Integer duration){
//        song.put(name, duration);
//        System.out.println("Song added successfully!");
//    }
//
//    public void viewSong(){
//
//    }


}
