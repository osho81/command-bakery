package com.yajava.service;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

// Receive reports of changes from cake object's property-change/observing methods

public class BakingControl implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("\nBaking status changed; " + evt.getPropertyName() + " : " + evt.getNewValue());
    }
}
