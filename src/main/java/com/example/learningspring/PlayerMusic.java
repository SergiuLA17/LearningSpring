package com.example.learningspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PlayerMusic {
    static List<Music> musicList = new ArrayList<>();
    @Autowired
    private ClassicMusic classicMusic;
    @Autowired
    private RockMusic rockMusic;

    public void setPlayerMusic(List<Music> musicList) {
        this.musicList = musicList;
    }

//    public PlayerMusic(ClassicMusic classicMusic) {
//        this.classicMusic = classicMusic;
//        musicList.add(classicMusic);
//    }

    public String playMusic() {
        return  classicMusic.getName() +" and "+ rockMusic.getName() ;

    }
}
