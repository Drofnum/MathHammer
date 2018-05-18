package com.pluralsight.mathhammer;

public class Wounds extends Hits {

    public double hits;
    public double toWound;
    public char reroll = 'n';
    private double woundResult;

    public double getWoundResult() {return woundResult;}

    public void wounding() {
        double misses = Math.abs((hits * (((7-toWound) /6) -1)));
        double chanceToWound = ((7 - toWound) / 6);
        switch (reroll) {
            case 'a':
                double woundReroll = (misses) * ((chanceToWound));
                woundResult = ((hits * ((7 - toWound) / 6)) + woundReroll);
                break;
            case 's':
                woundReroll = (misses * (1 / 6)) * (chanceToWound);
                woundResult = ((hits * ((7 - toWound) / 6)) + woundReroll);
                break;
            case 'n':
                woundResult = (hits * chanceToWound);
                break;
        }

    }
}