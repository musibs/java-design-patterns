package com.codefountain.design.patterns.structural.adapter.best;

public class VlcPlayer implements  MediaPackage{

    @Override
    public void playFile(String fileName) {
        System.out.println("Playing "+fileName+" in VLC media player");
    }
}
