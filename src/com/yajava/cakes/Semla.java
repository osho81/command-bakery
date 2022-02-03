package com.yajava.cakes;

import com.yajava.bake.BakeCommand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Semla extends Cake {

    private String milk;
    private String yeast;
    private String flour;
    private String egg;
    private String salt;
    private String cardamom;
    private String sugar;
    private String butter;
    private String almondPaste;
    private String whipCream;
    private String icingSugar;
    private int ovenTemperature;
    private int ovenMinutes;

    // Contents are filled in accordance with the process-steps
    public Semla(String cakeName, int cakeID, int celsius, int ovenMinutes) {
        super(cakeName, cakeID);
        this.milk = "";
        this.yeast = "";
        this.flour = "";
        this.egg = "";
        this.salt = "";
        this.cardamom = "";
        this.sugar = "";
        this.butter = "";
        this.almondPaste = "";
        this.whipCream = "";
        this.icingSugar = "";
        this.ovenTemperature = celsius;
        this.ovenMinutes = ovenMinutes;
    }

    public String getMilk() {
        return milk;
    }
    public void setMilk(String milk) {
        this.milk = milk;
    }
    public String getYeast() {
        return yeast;
    }
    public void setYeast(String yeast) {
        this.yeast = yeast;
    }
    public String getFlour() {
        return flour;
    }
    public void setFlour(String flour) {
        this.flour = flour;
    }
    public String getEgg() {
        return egg;
    }
    public void setEgg(String egg) {
        this.egg = egg;
    }
    public String getSalt() {
        return salt;
    }
    public void setSalt(String salt) {
        this.salt = salt;
    }
    public String getCardamom() {
        return cardamom;
    }
    public void setCardamom(String cardamom) {
        this.cardamom = cardamom;
    }
    public String getSugar() {
        return sugar;
    }
    public void setSugar(String sugar) {
        this.sugar = sugar;
    }
    public String getButter() {
        return butter;
    }
    public void setButter(String butter) {
        this.butter = butter;
    }
    public String getAlmondPaste() {
        return almondPaste;
    }
    public void setAlmondPaste(String almondPaste) {
        this.almondPaste = almondPaste;
    }
    public String getWhipCream() {
        return whipCream;
    }
    public void setWhipCream(String whipCream) {
        this.whipCream = whipCream;
    }
    public String getIcingSugar() {
        return icingSugar;
    }
    public void setIcingSugar(String icingSugar) {
        this.icingSugar = icingSugar;
    }
    public int getOvenTemperature() { return ovenTemperature; }
    public void setOvenTemperature(int ovenTemperature) { this.ovenTemperature = ovenTemperature; }
    public int getOvenMinutes() { return ovenMinutes; }
    public void setOvenMinutes(int ovenMinutes) { this.ovenMinutes = ovenMinutes; }

    @Override
    public String toString() {
        ArrayList<String> CakeContents = new ArrayList<>(Arrays.asList(milk, yeast, flour, egg, salt, cardamom, sugar, butter, almondPaste, whipCream, icingSugar));
        String returnStr = super.toString() + "\nSemla contents added: ";
        for (String str : CakeContents) {
            returnStr += str;
            if (!str.equals(""))
                returnStr += ", ";
        }
        return returnStr.substring(0, returnStr.length()-2) + "."; // Remove last comma + space
    }

}
