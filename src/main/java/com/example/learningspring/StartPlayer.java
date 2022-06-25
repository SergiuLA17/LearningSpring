package com.example.learningspring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartPlayer {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class)) {


            Computer computer = context.getBean("computer", Computer.class);
            System.out.println("Now playing: " + computer.playMusic(MusicGenre.CLASSICAL));

        }
    }
}
