package com.morgan;

import java.util.ArrayList;

public class Impostor {

    private boolean makeSus;
    private int maxImpostors;
    private int impostors;
    private ArrayList<Crewmate> newCrewmates;


    public Impostor(boolean makeSus, int maxImpostors, int impostors){
        this.makeSus = makeSus;
        this.maxImpostors = maxImpostors;
        this.impostors = impostors;
        this.newCrewmates = new ArrayList<Crewmate>();
    }

}
