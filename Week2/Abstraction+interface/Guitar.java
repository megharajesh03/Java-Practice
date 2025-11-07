//abstraction + interface combo 2

package com.demo;

interface Playable {
    void play();
}

abstract class Instrument implements Playable {
    public void tune() {
        System.out.println("Tuning the instrument...");
    }
}

public class Guitar extends Instrument {
    public Guitar() {
    }
    @Override
    public void play() {
        System.out.println("Playing the guitar...");
    }
    public static void main(String[] args) {
        Guitar myGuitar = new Guitar();

        myGuitar.tune();
        myGuitar.play();
    }
}
