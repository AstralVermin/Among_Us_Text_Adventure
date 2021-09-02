package com.morgan;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Tasks {

    public static void taskList(String[] args) {
        ArrayList<String> crewmateTasks = new ArrayList<String>();
        crewmateTasks.add("Emptying Trash");
        crewmateTasks.add("Testing Weapons");
        crewmateTasks.add("Performing medbay scan");
        crewmateTasks.add("Fixing wiring");
        crewmateTasks.add("Swiping admin card");
        crewmateTasks.add("Refueling engines");
        crewmateTasks.add("Downloading data");


        ArrayList<String> impostorTasks = new ArrayList<String>();
        impostorTasks.add("Standing Ominously");
        impostorTasks.add("Cleaning vents");
        impostorTasks.add("Turning power off");
        impostorTasks.add("Dumping into reactor");
    }
}
