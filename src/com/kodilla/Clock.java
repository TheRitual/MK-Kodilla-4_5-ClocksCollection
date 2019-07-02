package com.kodilla;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Clock {
    private LocalDateTime time;

    Clock(int hours, int minutes) {
        if(hours < 0) {
            hours = 0;
        } else if(hours > 23) {
            hours = 23;
        } else {
            hours = hours;
        }

        if(minutes < 0) {
            minutes = 0;
        } else if(minutes > 59) {
            minutes = 59;
        } else {
            minutes = minutes;
        }
        this.time = LocalDate.now().atTime(hours,minutes);
    }

    public void addHours(int hours) {
        this.time= this.time.plusHours(hours);
    }

    public void addMinutes(int minutes) {
        this.time= this.time.plusMinutes(minutes);
    }



    public String toString() {
        return time.toLocalTime().toString();
    }
}
