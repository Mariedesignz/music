package com.company;

public class TrumpetPlayer extends Vocalist {
    String trumpetType;

    public TrumpetPlayer(String n, String c, String s, String tp, String tt) {
        super(n,c,s,tp);
        trumpetType = tt;
    }
    public void show() {
        System.out.println("This is your Trumpet player.");
        System.out.println(name + ":" +
                country + ":" +
                style + ":" +
                timePeriod + ":" +
                trumpetType);
    }
}
