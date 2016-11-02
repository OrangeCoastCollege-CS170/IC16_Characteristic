package edu.orangecoastcollege.sbadajoz.ic16;
/*
Badajoz, Seve
CS A170
November 1, 2016

IC16
*/


public class Characteristic {
    private String mDescription;
    private int mRating;

    public Characteristic(String description) {
        this.mDescription = description;
        mRating = 0;
    }

    private boolean isValid(int newRating) {
        return (0 <= newRating && newRating <= 10);
    }

    public void setRating(int rating) {
        if(isValid(rating)) {
            mRating = rating;
        }
    }

    private void setDescription(String Description) {
        mDescription = Description;
    }

    public String getDescription() {
        return mDescription;
    }

    public int getRating() {
        return mRating;
    }

    public double getCompatibility(Characteristic other) {
        if (isMatch(other)) {
            return getCompatibilityMeasure(other);
        }
        return 0;
    }

    private double getCompatibilityMeasure(Characteristic other) {
        if(mRating!= 0 && other.mRating != 0)
        return 1- Math.sqrt(mRating - other.mRating)/81;
        return 0;
    }

    private boolean isMatch(Characteristic other) {
        return mDescription.equals(other.mDescription);
    }
}
