package com.example.learningspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartPlayer {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml")) {

//            PlayerMusic playerMusic = context.getBean("playerMusic", PlayerMusic.class);
//            playerMusic.playMusic();

            Computer computer = context.getBean("computer", Computer.class);

            Computer compute2 = context.getBean("computer", Computer.class);
            System.out.println(computer == compute2);

        }
    }
}
