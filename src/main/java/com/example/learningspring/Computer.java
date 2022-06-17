package com.example.learningspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Computer {
    private int id;
    private PlayerMusic playerMusic;

    @Autowired
    public Computer(PlayerMusic playerMusic) {
        this.id = 1;
        this.playerMusic = playerMusic;
    }

    @Override
    public String toString() {
        return "Computer: " + id + "\nPlaying " + playerMusic.playMusic();
    }
}
