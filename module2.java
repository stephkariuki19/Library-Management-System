package com.amigos;

public class module2 {
    public void chemistry() {
        String []chem = {"Organic Chemistry", "Physical Chemistry", "Polymer Chemistry"};
        System.out.println("The books in chemistry department are: ");
        for (String i :chem) {
            System.out.println(i);
        }
    }

    public void physics() {
        String []phyc = {"Mechanics", "Electrostatics", "Thermodynamics"};
        System.out.println("\nThe books in Physics department are: ");
        for (String i : phyc) {
            System.out.println(i);
        }
    }
        public void biology () {
            String [] bio = {"Entomology", "Zoology", "Anatomy"};
            System.out.println("\nThe books in Biology department are: ");
            for (String i : bio) {
                System.out.println(i);
            }
        }

    }
