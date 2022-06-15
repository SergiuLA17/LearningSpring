package com.example.learningspring;

public class PopMusic implements Music {
    @Override
    public String getName() {
        return "Ariana Grang - Music";
    }

    @Override
    public String getLength() {
        return "7:44 sec";
    }
}
