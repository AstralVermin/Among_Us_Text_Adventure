package com.morgan;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {



/*        int max = 1;
        int min = 8;
        int number;
        int number2;

        number = (int) ((Math.random() * (max - min)) + min);
        number2 = (int) ((Math.random() * (max - min)) + min);

        while (number == number2) {
            number = (int) ((Math.random() * (max - min)) + min);
            number2 = (int) ((Math.random() * (max - min)) + min);
        }
            System.out.println(number + " is sus!");
            System.out.println(number2 + " is sus!");*/

    }
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


}
