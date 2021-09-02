package com.morgan;

import java.util.ArrayList;

public class Impostor {

    private boolean makeSus;
    private int maxImpostors;
    private int impostors;
    private ArrayList<Crewmate> newCrewmates;


    public Impostor(boolean makeSus, int maxImpostors, int impostors) {
        this.makeSus = makeSus;
        this.maxImpostors = maxImpostors;
        this.impostors = impostors;
        this.newCrewmates = new ArrayList<Crewmate>();
    }

    public int susKey(int number, int number2) {
        int max = 1;
        int min = 8;
        number = (int) ((Math.random() * (max - min)) + min);
        number2 = (int) ((Math.random() * (max - min)) + min);

        while (number == number2) {
            number = (int) ((Math.random() * (max - min)) + min);
            number2 = (int) ((Math.random() * (max - min)) + min);
        }
        return susKey(number, number2);

    }
}



