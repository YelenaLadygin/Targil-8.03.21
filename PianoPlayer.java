package com.company;

public class PianoPlayer extends Player {

    @Override
    public void play (){
        System.out.println("Playing Bach");
    }
    public void practice (){
        System.out.println("Practice makes perfect!");
    }

    public PianoPlayer(String name, String favoriteGenre) {
        super(name, favoriteGenre);
    }

    public void playJazz (){
       System.out.println ("Playing I got Rhythm by George Gershwin");

    }
    @Override
    public void compose (){
        System.out.println("composing piano melody");
    }
}
