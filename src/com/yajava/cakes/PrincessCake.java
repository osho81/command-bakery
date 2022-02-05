package com.yajava.cakes;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.Arrays;

public class PrincessCake extends Cake {

    private String cakeBase;
    private String whipCream;
    private String vanillaCream;
    private String raspberryJam;
    private String marzipanLid;
    private String marzipanRose;
    private String icingSugar;
    private boolean ordered;
    private String status;

    // See Semla class for comments on Observer pattern components
    private PropertyChangeSupport propertyChangeSupport;

    public PrincessCake(String cakeName, int cakeID) {
        super(cakeName, cakeID);
        this.cakeBase = "";
        this.whipCream = "";
        this.vanillaCream = "";
        this.raspberryJam = "";
        this.marzipanLid = "";
        this.marzipanRose = "e";
        this.icingSugar = "";
        this.status = "Not delivered";
        this.propertyChangeSupport = new PropertyChangeSupport(this);
    }

    public String getCakeBase() { return cakeBase; }
    public void setCakeBase(String cakeBase) {
        this.cakeBase = cakeBase;
    }
    public String getWhipCream() {
        return whipCream;
    }
    public void setWhipCream(String whipCream) {
        this.whipCream = whipCream;
    }
    public String getVanillaCream() {
        return vanillaCream;
    }
    public void setVanillaCream(String vanillaCream) {
        this.vanillaCream = vanillaCream;
    }
    public String getRaspberryJam() {
        return raspberryJam;
    }
    public void setRaspberryJam(String raspberryJam) {
        this.raspberryJam = raspberryJam;
    }
    public String getMarzipanLid() {
        return marzipanLid;
    }
    public void setMarzipanLid(String marzipanLid) {
        this.marzipanLid = marzipanLid;
    }
    public String getMarzipanRose() {
        return marzipanRose;
    }
    public void setMarzipanRose(String marzipanRose) {
        this.marzipanRose = marzipanRose;
    }
    public String getIcingSugar() { return icingSugar; }
    public void setIcingSugar(String icingSugar) { this.icingSugar = icingSugar; }

    public boolean isOrdered() { return ordered; }

    // Report changes in the object state; The ordered-state is utilized in BakingControl class
    public void setOrdered(boolean ordered) {
        boolean oldOrdered = this.ordered;
        this.ordered = ordered;
        this.propertyChangeSupport.firePropertyChange("Ordered", oldOrdered, this.ordered);
    }

    public String getStatus() { return status; }

    public void setStatus(String status) {
        String oldDoneState = this.status;
        this.status = status;
        this.propertyChangeSupport.firePropertyChange("Princess cake delivered", oldDoneState, this.status);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener){
        this.propertyChangeSupport.addPropertyChangeListener(listener);
    }

    @Override
    public String toString() {
        ArrayList<String> CakeContents = new ArrayList<>(Arrays.asList(cakeBase, whipCream, vanillaCream, raspberryJam, marzipanLid, marzipanRose, icingSugar));
        String returnStr = super.toString() + "\nSemla contents added: ";
        for (String str : CakeContents) {
            returnStr += str;
            if (!str.equals(""))
                returnStr += ", ";
        }
        return returnStr.substring(0, returnStr.length()-2) + "."; // Remove last comma + space
    }

}
