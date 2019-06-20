package com.codefountain.design.patterns.structural.adapter.best;

public class Main {

    public static void main(String[] args) {

        MediaPlayer player = new Mp3Player();
        player.play("file1.mp3");


        player = new MediaAdapter(new Mp4Player());
        player.play("file2.mp4");

        player = new MediaAdapter(new VlcPlayer());
        player.play("file2.avi");


    }
}
