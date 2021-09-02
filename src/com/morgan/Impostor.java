package com.morgan;

import java.util.ArrayList;

public class Impostor {

    private boolean makeSus;
    private int maxImpostors;
    private int impostors;
    private ArrayList<Crewmate> crewmate;


    public Impostor(boolean makeSus, int maxImpostors, int impostors) {
        this.makeSus = makeSus;
        this.maxImpostors = maxImpostors;
        this.impostors = impostors;
        this.crewmate = new ArrayList<Crewmate>();
    }

    public int susDecider(int number, int number2){

        int max = 1;
        int min = 8;
        number = (int) ((Math.random() * (max - min)) + min);
        number2 = (int) ((Math.random() * (max - min)) + min);

        while (number == number2) {
            number = (int) ((Math.random() * (max - min)) + min);
            number2 = (int) ((Math.random() * (max - min)) + min);
        }
        return susDecider(number, number2);


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

/*    private boolean updateSus(Crewmate oldCrewmate, Crewmate impostor){
        int foundPosition = findCrewmate(oldCrewmate);
        if(foundPosition = <0){
            return false;
        }
    }*/

}




