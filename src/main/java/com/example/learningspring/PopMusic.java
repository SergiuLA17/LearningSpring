package com.example.learningspring;

import org.springframework.stereotype.Component;

@Component("musicBeanPop")
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
