package com.tts;

import java.util.HashMap;
import java.util.Scanner;

public class carloopHW {

        public static void main(String [] args) {

            HashMap<String, String> vehicles = new HashMap <String, String> ();
            vehicles.put("Cybertruck", "Tesla");
            vehicles.put("X7", "BMW");
            vehicles.put("R8", "Audi");
            vehicles.put("Rav4", "Toyota");
            vehicles.put("Wrangler", "Jeep");

            System.out.println("Hi, welcome to our dealership.");
            Scanner scan1 = new Scanner(System.in);
            System.out.println("What is your name?");
            String yourName = scan1.next();
            System.out.println("Hello " + yourName + " what car model are you looking for?");

            Scanner scan2 = new Scanner(System.in);
            String carChoice = scan2.next();
            //This now adds in their input, plus the statement "oh you're looking for a..."
            System.out.println("Oh, you're looking for a " + carChoice);

            if(vehicles.containsKey(carChoice)) {
                System.out.println("Great! We do have that model. ");
                System.out.println("The make for that model is " + (vehicles.get(carChoice)));

            }
            else {
                System.out.println("Sorry, we don't carry that model.");
                System.out.println("Have a nice day!");
            }
        }
    }


