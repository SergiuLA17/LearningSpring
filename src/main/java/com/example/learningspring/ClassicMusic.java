package com.example.learningspring;

public class ClassicMusic implements Music {
    String classicMusic;

    public ClassicMusic(String classicMusic) {
        this.classicMusic = classicMusic;
    }

    @Override
    public String getMusic() {
        return classicMusic;
    }

    @Override
    public String toString() {
        return classicMusic;
    }
}
