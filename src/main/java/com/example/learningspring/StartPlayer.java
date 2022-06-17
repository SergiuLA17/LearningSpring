package com.example.learningspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartPlayer {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml")) {

            PlayerMusic playerMusic = new PlayerMusic();
            playerMusic.addMusicToPlayerMusic( context.getBean("musicBeanClassic", ClassicMusic.class));
            playerMusic.addMusicToPlayerMusic( context.getBean("musicBeanRock", RockMusic.class));
            playerMusic.addMusicToPlayerMusic( context.getBean("musicBeanPop", PopMusic.class));

            playerMusic.playMusic();
        }
    }
}
