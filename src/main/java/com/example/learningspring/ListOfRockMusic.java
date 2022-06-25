package com.example.learningspring;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class ListOfRockMusic {
    static List<RockMusic> rockMusics = new ArrayList<>();
    {
        rockMusics.add(new RockMusic("Barracuda"));
        rockMusics.add(new RockMusic("American Girls"));
        rockMusics.add(new RockMusic("Hell"));
    }
}
