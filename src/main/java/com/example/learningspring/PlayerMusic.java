package com.example.learningspring;

import java.util.ArrayList;
import java.util.List;

public class PlayerMusic {
    List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    public void setPlayerMusic(List <Music> musicList) {
        this.musicList = musicList;
    }

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

    public PlayerMusic() {
    }

    public void addMusicToPlayerMusic(Music music) {
        musicList.add(music);
    }

    public void playMusic() {
        for (Music music:
             musicList) {
            System.out.println("Now playing: " + music.getName() + " Time: " + music.getLength());

        }
    }
}
