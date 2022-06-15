package com.example.learningspring;

public class ClassicMusic implements Music {
    @Override
    public String getName() {
        return "Bach";
    }

    @Override
    public String getLength() {
        return "8:33 sec";
    }
}
