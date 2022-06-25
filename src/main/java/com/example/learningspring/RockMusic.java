package com.example.learningspring;

public class RockMusic  implements Music{
    String rockMusic;

    public RockMusic(String rockMusic ){
        this.rockMusic = rockMusic;
    }

    @Override
    public String getMusic() {
        return rockMusic;
    }

    @Override
    public String toString() {
        return rockMusic;
    }
}
