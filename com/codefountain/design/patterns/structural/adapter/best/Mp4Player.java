package com.codefountain.design.patterns.structural.adapter.best;

public class Mp4Player implements MediaPackage {

    @Override
    public void playFile(String fileName) {
        System.out.println("Playing MP4 file "+fileName);
    }
}
