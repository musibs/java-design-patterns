package com.codefountain.design.patterns.structural.adapter.best;

public class Mp3Player implements MediaPlayer{

    @Override
    public void play(String fileName) {
        System.out.println("Playing MP3 file "+fileName);
    }
}
