package com.company;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {


    public static void main(String[] args) {
        String csvFile = "C:\\Users\\Ramadhani Kilango\\IdeaProjects\\KILA\\FILE.csv";
        String line = "";
        String cvsSplitBY = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] FILE = line.split(cvsSplitBY);
                System.out.println("FULL_NAME [" + FILE[1] + ",    REGISTRATION_NUMBER " + FILE[2]+",   CA"+FILE[3]+",   UE"+FILE[3]+"]");

            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}