package shumkovspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class MusicPlayer {

//    private List<Music> listMusic = new ArrayList<>();

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    private String name;
    private int volume;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }



//    public MusicPlayer() {
//        this.listMusic = listMusic;
//        this.name = name;
//        this.volume = volume;
//    }

//    public MusicPlayer(List<Music> listMusic) {
//        this.listMusic = listMusic;
//    }
//
//    public List<Music> getListMusic() {
//        return listMusic;
//    }
//
//    public void setListMusic(List<Music> listMusic) {
//        this.listMusic = listMusic;
//    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    public String playMusic(){
        return "Playing :" + classicalMusic.getSong();

    }



//    public void playMusic(){
//        for(Music music:listMusic){
//            System.out.println("Playing :" + music.getSong());
//        }
//    }
}
