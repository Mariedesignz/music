package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args, Object p, Object pl) {
        Vocalist miles = new TrumpetPlayer("Miles Davis", "USA", "jazz", "1950s",  "brass");
        Vocalist gray = new Guitarist("Gary Clark Jr", "USA", "blues" , "2010s",  6);
        Vocalist louis = new TrumpetPlayer("Louis Armstrong", "USA", "blues", "1920s", "brass");
        Vocalist jimi = new Guitarist("Jimi Hendrix", "USA", "rock", "1960s", 5);

        ArrayList<Song> library = new ArrayList<>();

        library.add(new Song("People Get Ready",
                "curtis", "Relaxing", "https//www.youtube.com/watch?v=VOXmaSCt4ZE"));
    }
}
