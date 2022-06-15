package com.example.learningspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartPlayer {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml")) {
//            PlayerMusic playerMusic1 = context.getBean("musicPlayer", PlayerMusic.class);
//            PlayerMusic playerMusic2 = context.getBean("musicPlayer", PlayerMusic.class);
//;
//            playerMusic1.playMusic();
//            playerMusic2.playMusic();
//
//            playerMusic1.setVolume(33);
//
//            System.out.println(playerMusic1.getVolume() + "\n" + playerMusic2.getVolume());

            ClassicMusic classicMusic = context.getBean("musicBeanClassic",ClassicMusic.class);
            System.out.println(classicMusic.getName());
            ClassicMusic classicMusic2 = context.getBean("musicBeanClassic",ClassicMusic.class);
            System.out.println(classicMusic2.getName());

        }
    }
}
