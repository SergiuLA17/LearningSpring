package com.example.learningspring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartPlayer {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class)) {

            PlayerMusic playerMusic = context.getBean("playerMusic", PlayerMusic.class);
            System.out.println(playerMusic.playMusic());

        }
    }
}
