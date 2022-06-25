package com.example.learningspring;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class ListOfClassicMusic {
   static List<ClassicMusic> classicMusics = new ArrayList<>();
    {
        classicMusics.add(new ClassicMusic("Mozart"));
        classicMusics.add(new ClassicMusic("Beethoven"));
        classicMusics.add(new ClassicMusic("Bach"));
    }
}
