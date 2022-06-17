package com.example.learningspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PlayerMusic {
    @Autowired
    private ClassicMusic classicMusic;
    @Autowired
    private RockMusic rockMusic;

    @Value("${playerMusic.name}")
    private String name;
    @Value("${playerMusic.volume}")
    private int volume;

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

    //    public PlayerMusic(ClassicMusic classicMusic) {
//        this.classicMusic = classicMusic;
//        musicList.add(classicMusic);
//    }

    public String playMusic() {
        return  name +" with volume: "+ volume ;

    }
}
