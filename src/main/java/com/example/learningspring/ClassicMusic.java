package com.example.learningspring;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("musicBeanClassic")
public class ClassicMusic implements Music {
    private ClassicMusic() {
    }


    public static ClassicMusic getClassicMusic() {
        return new ClassicMusic();
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destroy");
    }

    @Override
    public String getName() {
        return "Bach";
    }

    @Override
    public String getLength() {
        return "8:33 sec";
    }
}
