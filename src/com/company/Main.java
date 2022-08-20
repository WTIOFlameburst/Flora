package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<plant> savedPlantObjects = new ArrayList<plant>(); // users personal plants
        ArrayList<plant> plantDatabase = new ArrayList<plant>(); // reads from the database and stores it in an array
        ArrayList<String> lines = new ArrayList<>();  // Data from Database

        // Reads from database
        try (BufferedReader br = new BufferedReader(new FileReader("src\\com\\company\\Plant Database.txt"))) {
            while (br.ready()) {
                lines.add(br.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Organizes database into Object Array
        for (int i = 0; i < lines.size(); i++) {
            String[] split = lines.get(i).split(":");
            plantDatabase.add(new plant(split[0], split[1], split[2]));
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(plantDatabase.get(i).getPlantName() + " " + plantDatabase.get(i).getPlantType());
        }
    }
}
