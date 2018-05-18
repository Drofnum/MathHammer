package com.pluralsight.mathhammer;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);

        //Calculating and printing hits
/*        Hits hit1 = new Hits();
        System.out.print("Attacks: ");
        hit1.attacks = keyboard.nextDouble();
        System.out.print("To hit:");
        hit1.toHit = keyboard.nextDouble();
        hit1.hitting();
        hit1.getHitResult();
        System.out.println(hit1.getHitResult() + " Attacks hit.");

        //Calculating and printing wounds
        Wounds wound1 = new Wounds();

        System.out.print("Attacks: ");
        wound1.attacks = keyboard.nextDouble();
        System.out.print("To hit:");
        wound1.toHit = keyboard.nextDouble();
        wound1.hitting();
        wound1.getHitResult();
        System.out.println(wound1.getHitResult() + " Attacks hit.");

        wound1.hits = wound1.getHitResult();
        System.out.print("To Wound: ");
        wound1.toWound = keyboard.nextDouble();
        wound1.wounding();
        wound1.getWoundResult();
        System.out.println(wound1.getWoundResult() + " Hits wound.");
*/
        //Setting values and returning results
        Damage damage1 = new Damage();

        //Hits calculations
        System.out.print("Attacks: ");
        damage1.attacks = keyboard.nextDouble();
        System.out.print("To hit:");
        damage1.toHit = keyboard.nextDouble();
        damage1.hitting();
        damage1.getHitResult();
        System.out.println(damage1.getHitResult() + " Attacks hit.");

        //Wounds calculations
        damage1.hits = damage1.getHitResult();
        System.out.print("To Wound: ");
        damage1.toWound = keyboard.nextDouble();
        damage1.wounding();
        damage1.getWoundResult();
        System.out.println(damage1.getWoundResult() + " Hits wound.");

        //Damage calculations
        damage1.wounds = damage1.getWoundResult();
        System.out.print("Rend:");
        damage1.rend = keyboard.nextDouble();
        System.out.print("Save:");
        damage1.save = keyboard.nextDouble();
        damage1.saves();
        damage1.getSaveResult();
        System.out.println(damage1.getSaveResult() + " Wounds saved.");
        System.out.print("Damage:");
        damage1.damage = keyboard.next();
        damage1.damageDone();
        damage1.getDamageDealt();
        System.out.println(damage1.getDamageDealt() + " Damage done");
/*
        Damage damage3 = new Damage();
        damage3.wardSave();
        damage3.getWardSaves();
        System.out.println(damage3.getWardSaves());
*/
    }



}


