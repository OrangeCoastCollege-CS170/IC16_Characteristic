package edu.orangecoastcollege.sbadajoz.ic16;
/*
Badajoz, Seve
CS A170
November 1, 2016

IC16
*/
public class CharacteristicDemo {
    public static void main(String[] args) {
        Characteristic funny1 = new Characteristic("To be able to make someone laugh");
        Characteristic serious1 = new Characteristic("To take everything literally and stick to a strict guideline ");
        Characteristic funny2 = new Characteristic(funny1.getDescription());

        funny1.setRating(10);
        funny2.setRating(5);

        System.out.println("funny 1 has a rating of " + funny1.getRating());
        System.out.println("funny 2 has a rating of " + funny2.getRating());

        System.out.println("Funny 1 and Funny 2 have a compatibility of " + funny1.getCompatibility(funny2));

        System.out.println("Funny 1 and serious 1 have a compatibility of " + funny1.getCompatibility(serious1));
        }

    }

