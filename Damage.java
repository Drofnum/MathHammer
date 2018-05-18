package com.pluralsight.mathhammer;

public class Damage extends Wounds {

    public double wounds = 0;
    public double woundsUnsaved = 0;
    public double rend = 0;
    public double save = 4;
    private double saveResult = 100;
    private double damageDealt = 100;
    public char ward = '1';
    private double wardSaves = 100;

    public double getSaveResult() {return saveResult;}
    public double getDamageDealt() {return damageDealt;}
    public double getWardSaves() {return wardSaves;}
    String damage;

    public Damage() {
        damage = "D6";
    }


    public void saves() {
        woundsUnsaved = (wounds) * (1 - ((7 - save - rend) / 6));
        saveResult   = (wounds) - (woundsUnsaved);

        }

    public void damageDone() {
        woundsUnsaved = (wounds) * (1 - ((7 - save - rend) / 6));
        saveResult = (wounds) - (woundsUnsaved);
        switch (damage) {
            case "D3":
            case "d3":
                damageDealt = (woundsUnsaved) * (1.5);
                break;
            case "D6":
            case "d6":
                damageDealt = (woundsUnsaved) * (3.5);
                break;
            default:
                double damageNumber = Double.parseDouble(damage);
                damageDealt = (woundsUnsaved) * (damageNumber);
                break;
        }
    }

    public void wardSave() {
        switch(ward) {
            case '1':
                wardSaves = (wounds) * (1 - ((7 - save - rend) / 6));
                break;
            case '6':
                wardSaves = (wounds) * (1 / 6);
                break;
            case '5':
                wardSaves = (wounds) * (2 / 6);
                break;
            case '4':
                wardSaves = (wounds) * (3 / 6);
                break;
            default:
                break;
        }
    }
}
