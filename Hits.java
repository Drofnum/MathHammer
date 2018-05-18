package com.pluralsight.mathhammer;

public class Hits {
    public double attacks;
    public double toHit;
    public char reroll = 'n';
    private double hitResult;



/*
    public double getAttacks() {return attacks;}
    public void setAttacks (double attacks) {this.attacks = attacks;}
*/
    public double getHitResult() {return hitResult;}


    public void hitting() {
        double misses = Math.abs((attacks * (((7-toHit) /6) -1)));
        double chanceToHit = ((7 - toHit) / 6);
        switch (reroll) {
            case 'a':
                double hitReroll = (misses) * ((chanceToHit) + ((1 - chanceToHit) * (chanceToHit)));
                hitResult = ((attacks * ((7 - toHit) / 6)) + hitReroll);
                break;
            case 's':
                hitReroll = (misses) * ((chanceToHit) + (1 / 6 * (chanceToHit)));
                hitResult = ((attacks * ((7 - toHit) / 6)) + hitReroll);
                break;
            case 'n':
                hitResult = (attacks * chanceToHit);
                break;
        }

    }
}
