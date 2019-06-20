package com.codefountain.design.patterns.structural.adapter.best;

public class MediaAdapter implements MediaPlayer {

    private MediaPackage mediaPackage;

    public MediaAdapter(MediaPackage mediaPackage) {
        this.mediaPackage = mediaPackage;
    }

    @Override
    public void play(String fileName) {
        System.out.println("Using the adapter");
        mediaPackage.playFile(fileName);
    }
}
