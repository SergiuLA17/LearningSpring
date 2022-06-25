package com.example.learningspring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ListOfPopMusic {
    static List<PopMusic> popMusics = new ArrayList<>();
    {
        popMusics.add(new PopMusic("Rihanna"));
        popMusics.add(new PopMusic("Beyonce"));
        popMusics.add(new PopMusic("Shakira"));
    }
}
