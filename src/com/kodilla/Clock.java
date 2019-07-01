package com.kodilla;

public class Clock {
    private int minutes;
    private int hours;

    Clock(int hours, int minutes) {
        if(hours < 0) {
            this.hours = 0;
        } else if(hours > 11) {
            this.hours = 11;
        } else {
            this.hours = hours;
        }

        if(minutes < 0) {
            this.minutes = 0;
        } else if(minutes > 59) {
            this.minutes = 59;
        } else {
            this.minutes = minutes;
        }
    }

    public void addHours(int hours) {
        this.hours = (this.hours + hours) % 12;
    }

    public void addMinutes(int minutes) {
        this.minutes += minutes;
        if(this.minutes > 59) {
            addHours(1);
        }
        this.minutes %= 60;
    }



    public String toString() {
        return hours + ":" + (minutes < 10 ? "0" : "") + minutes;
    }
}
