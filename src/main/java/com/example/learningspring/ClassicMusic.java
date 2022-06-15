package com.example.learningspring;

public class ClassicMusic implements Music {
    private ClassicMusic(){

    }
    public  static ClassicMusic getClassicMusic(){
        return new ClassicMusic();
    }

    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy(){
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
