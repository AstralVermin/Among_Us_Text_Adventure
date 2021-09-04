package com.morgan;

import java.util.ArrayList;

public class Crewmate {
    private String colour;
    private String id;
    private boolean isSus;
    private boolean isDead;
    private boolean makeSus;
    private int maxImpostors;
    private int impostors;
    private ArrayList<Crewmate> crewmate;



    public Crewmate(String colour, String id, boolean isSus, boolean isDead) {
        this.colour = colour;
        this.id = id;
        this.isSus = isSus;
        this.isDead = isDead;
    }
    public void Impostor(boolean makeSus, int maxImpostors, int impostors) {
        this.makeSus = makeSus;
        this.maxImpostors = maxImpostors;
        this.impostors = impostors;
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

    public boolean isMakeSus() {
        return makeSus;
    }

    public void setMakeSus(boolean makeSus) {
        this.makeSus = makeSus;
    }

    public int getMaxImpostors() {
        return maxImpostors;
    }

    public void setMaxImpostors(int maxImpostors) {
        this.maxImpostors = maxImpostors;
    }

    public int getImpostors() {
        return impostors;
    }

    public void setImpostors(int impostors) {
        this.impostors = impostors;
    }

    public ArrayList<Crewmate> getCrewmate() {
        return crewmate;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSus(boolean sus) {
        isSus = sus;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public void setCrewmate(ArrayList<Crewmate> crewmate) {
        this.crewmate = crewmate;
    }

    public static Crewmate createCrewmate(String colour, String id, boolean isSus, boolean isDead){return new Crewmate(colour, id, isSus, isDead); }



    public static void crewmate(){
        ArrayList<Crewmate> crewmate = new ArrayList<Crewmate>();

        Crewmate crewmate2 = Crewmate.createCrewmate("Red", "2", false, false);
        Crewmate crewmate3 = Crewmate.createCrewmate("Green", "3", false, false);
        Crewmate crewmate4 = Crewmate.createCrewmate("Black", "4", false, false);
        Crewmate crewmate5 = Crewmate.createCrewmate("White", "5", false, false);
        Crewmate crewmate6 = Crewmate.createCrewmate("Pink", "6", false, false);
        Crewmate crewmate7 = Crewmate.createCrewmate("Brown", "7", false, false);
        Crewmate crewmate8 = Crewmate.createCrewmate("Teal", "8", false, false);
    }
    public void susDecider(Crewmate impostor, Crewmate impostor2){

        int max = 1;
        int min = 8;
        int number = (int) ((Math.random() * (max - min)) + min);
        int number2 = (int) ((Math.random() * (max - min)) + min);

        while (number == number2) {
            number = (int) ((Math.random() * (max - min)) + min);
            number2 = (int) ((Math.random() * (max - min)) + min);
        }

        for(int i = 0; i <  this.crewmate.size(); i++){
            Crewmate crewmate = this.crewmate.get(i);
            if(crewmate.getId().equals(number)){
                isSus = true;
                this.crewmate.set(i, impostor);
            } if (crewmate.getId().equals(number2)){
                isSus = true;
                this.crewmate.set(i, impostor2);
            } else{
                return;
            }
        }
        susDecider(impostor, impostor2);
    }
    private int findCrewmate(Crewmate crewmate){ return this.crewmate.indexOf(crewmate);}

    private int findCrewmate(String id){
        boolean susMatch = false;
        for(int i = 0; i <  this.crewmate.size(); i++){
            Crewmate crewmate = this.crewmate.get(i);
            if(crewmate.getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

    public void printCrewmates() {
        System.out.println("Crewmate List");
        for(int i=0; i<this.crewmate.size(); i++) {
            System.out.println((i+1) + "." +
                    this.crewmate.get(i).getColour() + " -> " +
                    this.crewmate.get(i).isSus());
        }

    }
}
