/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema3.relojConAlarma;

/**
 *
 * @author chiqui
 */
public class ClockDisplay {

    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;

    /**
     * Constructor for ClockDisplay objects. This constructor creates a new
     * clock set at 00:00.
     */
    public ClockDisplay() {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplay();
    }

    /**
     * Constructor for ClockDisplay objects. This constructor creates a new
     * clock set at the time specified by the parameters.
     */
    public ClockDisplay(int hour, int minute) {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        setTime(hour, minute);
    }

    /**
     * This method should get called once every minute - it makes the clock
     * display go one minute forward.
     */
    public void timeTick() {
        minutes.increment();
        if (minutes.getValue() == 0) {  // it just rolled over!
            hours.increment();
        }
        updateDisplay();
    }

    /**
     * Set the time of the display to the specified hour and minute.
     */
    public void setTime(int hour, int minute) {
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
    }

    /**
     * Return the current time of this display in the format HH:MM.
     */
    public String getTime() {
        return displayString;
    }

    /**
     * Update the internal string that represents the display.
     */
    private void updateDisplay() {
        boolean AM = hours.getValue() < 12;
        String auxAM;

        if (AM) {
            auxAM = " AM";
        } else {
            auxAM = " PM";
        }

        if (hours.getValue() == 0 || hours.getValue() == 12) {
            displayString = "12" + ":" + minutes.getDisplayValue() + auxAM;

        } else if (AM) {
            displayString = (hours.getValue() - 12) + ":"
                    + minutes.getDisplayValue() + " PM";

        } else if (!AM) {
            if (hours.getValue() < 22) {
                displayString = "0" + (hours.getValue() - 12) + ":" + minutes.getDisplayValue() + auxAM;
            } else {

                displayString = (hours.getValue() - 12) + ":" + minutes.getDisplayValue() + auxAM;

            }
        }

    }

    public void printTime() {
        System.out.println(displayString);
    }
}