package com.company;

public class Song {
    String mytitle;
    String player;
    String plist;
    String yturl;

    public Song(String mt, String p, String pl, String yu) {
        mytitle = mt;
        player = p;
        plist = pl;
        yturl = yu;
    }

    public void show() {
        System.out.println("This is the title of the song.");
        System.out.println(mytitle + ":" +
                player + ":" +
                plist + ":" +
                yturl);
    }
}
