package com.example.learningspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartPlayer {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml")) {
            PlayerMusic playerMusic = context.getBean("musicPlayer", PlayerMusic.class);
            playerMusic.playMusic();
            System.out.println(playerMusic.getName() + "\n" + playerMusic.getVolume());

        }
    }
}
