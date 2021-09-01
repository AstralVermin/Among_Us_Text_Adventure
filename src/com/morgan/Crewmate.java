package com.morgan;

public class Crewmate {
    private String colour;
    private int id;
    private boolean isSus;
    private boolean isDead;


    public Crewmate(String colour, int id, boolean isSus, boolean isDead) {
        this.colour = colour;
        this.id = id;
        this.isSus = isSus;
        this.isDead = isDead;
    }

    public String getColour() {
        return colour;
    }

    public int getId() {
        return id;
    }

    public boolean isSus() {
        return isSus;
    }

    public boolean isDead() {
        return isDead;
    }

    public static Crewmate createCrewmate(String colour, int id, boolean isSus, boolean isDead){return new Crewmate(colour, id, isSus, isDead); }

}
