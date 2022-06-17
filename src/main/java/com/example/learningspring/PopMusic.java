package com.example.learningspring;

public class PopMusic implements Music {
    String popMusic;

    public PopMusic(String popMusic) {
        this.popMusic = popMusic;
    }

    @Override
    public String getMusic() {
        return popMusic;
    }

    @Override
    public String toString() {
        return popMusic;
    }
}
