package com.example.learningspring;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class PlayerMusic {
    List<RockMusic> musicRockList = ListOfRockMusic.rockMusics;
    List<ClassicMusic> classicMusics = ListOfClassicMusic.classicMusics;
    List<PopMusic> popMusics = ListOfPopMusic.popMusics;

    public Music playMusic(MusicGenre musicGenre) {
        if (musicGenre == MusicGenre.CLASSICAL) {
            return classicMusics.get(new Random().nextInt(0, 2));
        } else if (musicGenre == MusicGenre.POP) {
            return popMusics.get(new Random().nextInt(0, 2));
        } else
            return musicRockList.get(new Random().nextInt(0, 2));
    }
}
