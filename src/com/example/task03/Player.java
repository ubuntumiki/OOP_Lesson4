package com.example.task03;

public class Player implements Playable, Recordable{

    public void play(){
        System.out.println("Playing");
    }

    public void pause(){
        System.out.println("Pause");
    }

    public void stop(){
        System.out.println("Stop");
    }

    public void record(){
        System.out.println("Record");
    }
}
