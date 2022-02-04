package com.yajava.cakes;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.Arrays;

public class ChocolateCake extends Cake {

    private String butter;
    private String sugar;
    private String egg;
    private String flour;
    private String cocoa;
    private String vanillaSugar;
    private String salt;
    private int ovenTemperature;
    private int ovenMinutes;
    private boolean done;

    // See Semla class for comments on Observer pattern components
    private PropertyChangeSupport propertyChangeSupport;

    public ChocolateCake(String cakeName, int cakeID, int celsius, int ovenMinutes) {
        super(cakeName, cakeID);
        this.butter = "";
        this.sugar = "";
        this.egg = "";
        this.flour = "";
        this.cocoa = "";
        this.vanillaSugar = "";
        this.salt = "";
        this.ovenTemperature = celsius;
        this.ovenMinutes = ovenMinutes;
        this.propertyChangeSupport = new PropertyChangeSupport(this);
    }

    public String getButter() {
        return butter;
    }
    public void setButter(String butter) {
        this.butter = butter;
    }
    public String getSugar() {
        return sugar;
    }
    public void setSugar(String sugar) {
        this.sugar = sugar;
    }
    public String getEgg() {
        return egg;
    }
    public void setEgg(String egg) {
        this.egg = egg;
    }
    public String getFlour() {
        return flour;
    }
    public void setFlour(String flour) {
        this.flour = flour;
    }
    public String getCocoa() {
        return cocoa;
    }
    public void setCocoa(String cocoa) {
        this.cocoa = cocoa;
    }
    public String getVanillaSugar() {
        return vanillaSugar;
    }
    public void setVanillaSugar(String vanillaSugar) {
        this.vanillaSugar = vanillaSugar;
    }
    public String getSalt() {
        return salt;
    }
    public void setSalt(String salt) {
        this.salt = salt;
    }
    public int getOvenTemperature() {
        return ovenTemperature;
    }
    public void setOvenTemperature(int ovenTemperature) { this.ovenTemperature = ovenTemperature;}
    public int getOvenMinutes() {
        return ovenMinutes;
    }
    public void setOvenMinutes(int ovenMinutes) {
        this.ovenMinutes = ovenMinutes;
    }
    public boolean isDone() { return done; }

    public void setDone(boolean done) {
        boolean oldDoneState = this.done;
        this.done = done;
        this.propertyChangeSupport.firePropertyChange("ChocolateCakeDone", oldDoneState, this.done);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener){
        this.propertyChangeSupport.addPropertyChangeListener(listener);
    }

    @Override
    public String toString() {
        ArrayList<String> CakeContents = new ArrayList<>(Arrays.asList(butter, sugar, egg, flour, cocoa, vanillaSugar, salt));
        String returnStr = super.toString() + "\nChocolate cake contents added: ";
        for (String str : CakeContents) {
            returnStr += str;
            if (!str.equals(""))
                returnStr += ", ";
        }
        return returnStr.substring(0, returnStr.length()-2)  + "."; // Remove last comma + space
    }

}
