package com.example.learningspring;

public class RockMusic implements Music{

    @Override
    public String getName() {
        return "More 5";
    }

    @Override
    public String getLength() {
        return "4:33 sec";
    }
}
