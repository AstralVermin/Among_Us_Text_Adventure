package com.morgan;

import java.util.ArrayList;

public class Crewmate {
    private String colour;
    private String id;
    private boolean isSus;
    private boolean isDead;
    private ArrayList<Crewmate> crewmate;


    public Crewmate(String colour, String id, boolean isSus, boolean isDead) {
        this.colour = colour;
        this.id = id;
        this.isSus = isSus;
        this.isDead = isDead;
    }


    public String getColour() {
        return colour;
    }

    public String getId() {
        return id;
    }

    public boolean isSus() {
        return isSus;
    }

    public boolean isDead() {
        return isDead;
    }

    public static Crewmate createCrewmate(String colour, String id, boolean isSus, boolean isDead){return new Crewmate(colour, id, isSus, isDead); }


    public static void crewmate(){
        ArrayList<Crewmate> crewmate = new ArrayList<Crewmate>();

        Crewmate crewmate1 = Crewmate.createCrewmate("Blue", "1", false, false);
        Crewmate crewmate2 = Crewmate.createCrewmate("Red", "2", false, false);
        Crewmate crewmate3 = Crewmate.createCrewmate("Green", "3", false, false);
        Crewmate crewmate4 = Crewmate.createCrewmate("Black", "4", false, false);
        Crewmate crewmate5 = Crewmate.createCrewmate("White", "5", false, false);
        Crewmate crewmate6 = Crewmate.createCrewmate("Pink", "6", false, false);
        Crewmate crewmate7 = Crewmate.createCrewmate("Brown", "7", false, false);
        Crewmate crewmate8 = Crewmate.createCrewmate("Teal", "8", false, false);
    }



}
